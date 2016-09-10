package br.com.modulo4.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
	
	@Id @GeneratedValue
	private Long id;
	private String description;
	
	@ManyToOne @JoinColumn
	private ContactType type;
	
	@JoinColumn @ManyToOne
	private Client client;
	
	public Contact(String description) {
		this.description = description;
	}

}
