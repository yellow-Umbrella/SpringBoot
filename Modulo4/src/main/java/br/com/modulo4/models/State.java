package br.com.modulo4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class State {
	
	@Id @GeneratedValue
	private Integer id;
	//@Column(unique=true) // so that it stays unique on the DB
	private String uf;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getUf() {
		return uf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}
	
	public String toString() {
		return "uf";
	}

}
