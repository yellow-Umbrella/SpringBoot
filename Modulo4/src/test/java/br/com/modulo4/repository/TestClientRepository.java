package br.com.modulo4.repository;

//get more info
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.modulo4.models.Client;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class TestClientRepository {
	
	@Autowired
	ClientRepository cliRepository;;
	
	@Autowired
	EntityManager entity;
	
	@Test
	public void saveTest() {
		
		Client cli = new Client("Renan");
		Client saved = cliRepository.save(cli);
		Assert.assertNotNull(saved.getId());
		
	}
	
	@Test
	public void getByName() {
		
		Client cli = new Client("Renan");
		entity.persist(cli);
		
		Client found = cliRepository.getByName("Renan");
		
		assertThat(found.getName()).isEqualTo(cli.getName());
		
	}
	
	@Test
	public void getAllTest() {
		
		Client cli1 = new Client("Renan");
		Client cli2 = new Client("Carlos");
		
		entity.persist(cli1);
		entity.persist(cli2);
		
		List<Client> list = cliRepository.getAll();
		assertThat(list.get(0).getName()).isEqualTo(cli1.getName());
		assertThat(list.get(1).getName()).isEqualTo(cli2.getName());
		
	}
	
	

}
