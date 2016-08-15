package br.com.modulo4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {
	
	@Id @GeneratedValue
	private Long id;
	
	private String name;
	
	@Column(nullable=false, length=50)
	private String email;
	
	public Client() {
		
	}
	
	public Client(String name, String email) {
		this.name = name;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "id: " + id + " Name: " + name + " email: " + email;
	}

}
