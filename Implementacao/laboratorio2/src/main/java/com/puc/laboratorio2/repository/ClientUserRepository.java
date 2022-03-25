package com.puc.laboratorio2.repository;

import com.puc.laboratorio2.model.client.ClientUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientUserRepository extends JpaRepository<ClientUser, Long> {
    
}
