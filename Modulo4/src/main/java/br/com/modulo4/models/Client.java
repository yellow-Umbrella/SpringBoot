package br.com.modulo4.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Client {
	
	@Id @GeneratedValue
	private Long id;
	
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="client")
	private List<Contact> contacts = new ArrayList<>();
	
	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	@JoinColumn @ManyToOne
	private State state;
	
	public Client() {
		
	}
	
	public Client(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	public String toString() {
		return "id: " + id + " Name: " + name;
	}

}
