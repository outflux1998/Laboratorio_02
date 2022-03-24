package com.test.alugueldeautomoveis.repository;

import com.test.alugueldeautomoveis.model.client.ClientUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientUserRepository extends JpaRepository<ClientUser, Long> {
    
}
