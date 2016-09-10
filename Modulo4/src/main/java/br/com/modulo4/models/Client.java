package br.com.modulo4.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
	
	@Id @GeneratedValue
	private Long id;
	
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="client", fetch=FetchType.EAGER) //eager loads arrayList when it instantiate
	private List<Contact> contacts = new ArrayList<>();
	
	@JoinColumn @ManyToOne
	private State state;
	

}
