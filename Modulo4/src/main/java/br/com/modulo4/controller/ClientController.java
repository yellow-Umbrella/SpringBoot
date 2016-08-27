package br.com.modulo4.controller;

import java.util.List;

import javax.annotation.PostConstruct;
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
	
	private boolean edit = false;
	
	private List<Client> clients;
	
	private Client client = new Client();
	
	@PostConstruct
	public void init() {
		clients = cliRepository.getAll();
	}
	
	public void save() { //save knows if you want to update or save a new
		cliRepository.save(client);
		if(!edit)
			clients.add(client);
		client = new Client(); //to "refresh"
		edit = false;
	}
	
	public void delete(Client c) {
		cliRepository.delete(c);
		clients.remove(c);
	}
	
	public void edit(Client c) {
		setClient(c);
		edit = true;
	}
	
	public void cancel() {
		client = new Client();
		edit = false;
	}
	
	//get and set
	
	public void setEdit(boolean edit) {
		this.edit = edit;
	}
	
	public boolean getEdit() {
		return edit;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<Client> getClients() {
		return clients;
	}
	
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

}
