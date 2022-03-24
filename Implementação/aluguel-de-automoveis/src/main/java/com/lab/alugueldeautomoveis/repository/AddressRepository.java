package com.lab.alugueldeautomoveis.repository;

import com.lab.alugueldeautomoveis.model.client.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
