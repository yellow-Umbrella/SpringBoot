package br.com.modulo4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.modulo4.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {
	

}
