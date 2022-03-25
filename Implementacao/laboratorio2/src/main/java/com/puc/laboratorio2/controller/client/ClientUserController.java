package com.puc.laboratorio2.controller.client;

import java.util.List;

import com.puc.laboratorio2.model.client.ClientUser;
import com.puc.laboratorio2.repository.ClientUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/clients")
public class ClientUserController {

	@Autowired
	private ClientUserRepository repository;
	
	@GetMapping
	public List<ClientUser> getAll() {
		return repository.findAll();
	}

	@GetMapping(value = "/{id}")
	public ClientUser get(@PathVariable Long id) {
		return repository.getById(id);
	}
	
	@PostMapping
	public ClientUser insert(@RequestBody ClientUser client) {
		return repository.save(client);
	}
}
