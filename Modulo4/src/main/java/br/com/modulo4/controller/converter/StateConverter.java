package br.com.modulo4.controller.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.modulo4.models.State;
import br.com.modulo4.repository.StateRepository;

@Component
public class StateConverter implements Converter {
	
	@Autowired
	StateRepository repository;
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		if(arg2.isEmpty())
			return null;
		
		try { //se tiver problema na conversao salve como vazio...
			State state = repository.findOne(new Integer(arg2));
			return state;
		} catch(Exception e) {
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if(arg2 instanceof State) {
			State state = (State) arg2;
			return state.getId().toString();
		}
		else {
			return null;
		}
	}

}
