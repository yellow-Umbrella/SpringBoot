package br.com.modulo4.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contact {
	
	@Id @GeneratedValue
	private Integer id;
	private String stg;
	
	@JoinColumn @ManyToOne
	private Client client;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getStg() {
		return stg;
	}
	
	public void setStg(String stg) {
		this.stg = stg;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public String toString() {
		return stg;
	}

}
