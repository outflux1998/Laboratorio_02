package com.puc.laboratorio2.controller.client;
import java.util.List;

import com.puc.laboratorio2.model.client.Address;
import com.puc.laboratorio2.repository.AddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/clients/address")
public class AddressController {

	@Autowired
	private AddressRepository repository;
	
	@GetMapping
	public List<Address> getAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Address get(@PathVariable Long id) {
		return repository.getById(id);
	}
	
	@PostMapping
	public Address insert(@RequestBody Address address) {
		return repository.save(address);
	}
}
