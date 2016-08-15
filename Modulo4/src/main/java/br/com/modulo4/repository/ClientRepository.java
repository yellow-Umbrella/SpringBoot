package br.com.modulo4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.modulo4.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
	@Query("SELECT cli FROM Client cli WHERE cli.email=:email") //get more info on how it works
	public Client getByEmail(@Param("email") String email);
	
	@Query("SELECT cli FROM Client cli")
	public List<Client> getAll();

}
