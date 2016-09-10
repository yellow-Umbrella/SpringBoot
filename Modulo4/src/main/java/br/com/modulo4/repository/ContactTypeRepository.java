package br.com.modulo4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.modulo4.models.ContactType;

@Repository
public interface ContactTypeRepository extends JpaRepository<ContactType, Integer> {

}
