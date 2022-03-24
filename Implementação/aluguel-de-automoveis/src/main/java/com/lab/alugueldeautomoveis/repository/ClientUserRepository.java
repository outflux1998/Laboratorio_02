package com.lab.alugueldeautomoveis.repository;

import com.lab.alugueldeautomoveis.model.client.ClientUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientUserRepository extends JpaRepository<ClientUser, Long> {
    
}
