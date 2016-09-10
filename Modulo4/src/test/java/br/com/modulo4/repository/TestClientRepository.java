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
		
		//Client cli = new Client("Renan", "renan@gmail.com");
		//Client saved = cliRepository.save(cli);
		//Assert.assertNotNull(saved.getId());
		
	}
	
	@Test
	public void getByEmailTest() {
		
		//Client cli = new Client("Renan", "renan@gmail.com");
		//entity.persist(cli);
		
		//Client found = cliRepository.getByEmail("renan@gmail.com");
		
		//assertThat(found.getEmail()).isEqualTo(cli.getEmail());
		
	}
	
//	@Test
//	public void getAllTest() {
//		
//		Client cli1 = new Client("Renan", "renan@gmail.com");
//		Client cli2 = new Client("Carlos", "carlos@gmail.com");
//		
//		entity.persist(cli1);
//		entity.persist(cli2);
//		
//		List<Client> list = cliRepository.getAll();
//		assertThat(list.get(0).getName()).isEqualTo(cli1.getName());
//		assertThat(list.get(1).getName()).isEqualTo(cli2.getName());
//		
//	}
	
	

}
