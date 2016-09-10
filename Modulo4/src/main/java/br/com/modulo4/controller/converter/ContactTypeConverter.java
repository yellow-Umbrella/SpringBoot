package br.com.modulo4.controller.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.modulo4.models.ContactType;
import br.com.modulo4.repository.ContactTypeRepository;

public class ContactTypeConverter implements Converter {
	
	@Autowired
	ContactTypeRepository repository;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		if(arg2.isEmpty())
			return null;
		
		try {
			ContactType type = repository.findOne(new Integer(arg2));
			return type;
		} catch(Exception e) {
			return null;
		}
		
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if(arg2 instanceof ContactType) {
			ContactType type = (ContactType) arg2;
			return type.getId().toString();
		}
		else {
			return null;
		}
	}

}
