package com.test.alugueldeautomoveis.repository;

import com.test.alugueldeautomoveis.model.client.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
