package br.com.modulo4.controller;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.modulo4.models.Client;
import br.com.modulo4.repository.ClientRepository;

@Named
@ViewScoped
public class ClientController {
	
	@Autowired
	private ClientRepository cliRepository;
	
	private Client client = new Client();
	
	public void save() {
		cliRepository.save(getClient());
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}

}
