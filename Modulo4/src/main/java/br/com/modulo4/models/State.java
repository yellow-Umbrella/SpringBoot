package br.com.modulo4.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class State {
	
	@Id @GeneratedValue
	private Integer id;
	//@Column(unique=true) // so that it stays unique on the DB
	private String uf;


}
