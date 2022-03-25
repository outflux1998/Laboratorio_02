package br.com.lab2.mvc.pv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lab2.mvc.pv2.model.ClientUser;

@Repository
public interface ClientUserRepository extends JpaRepository<ClientUser, Long> {
	
}