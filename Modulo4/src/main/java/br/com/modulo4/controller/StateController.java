package br.com.modulo4.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.modulo4.models.State;
import br.com.modulo4.repository.StateRepository;

@Named @ViewScoped
public class StateController {
	
	@Autowired
	private StateRepository repository;
	
	private List<State> states;
	
	private State state = new State();

	private boolean edit = false;
	
	@PostConstruct
	public void init() {
		setStates(repository.findAll());
	}
	
	public void save() {
		repository.save(state);
		if(!edit)
			states.add(state);
		state = new State(); // "refresh"
		edit = false;
	}
	
	public void delete(State s) {
		repository.delete(s);
		states.remove(s);
	}
	
	public void edit(State s) {
		setState(s);
		edit = true;
	}
	
	public void cancel() {
		state = new State();
		edit = false;
	}
	
	// get and set

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public boolean getEdit() {
		return edit;
	}
	
	public void setEdit(boolean edit) {
		this.edit = edit;
	}

}
