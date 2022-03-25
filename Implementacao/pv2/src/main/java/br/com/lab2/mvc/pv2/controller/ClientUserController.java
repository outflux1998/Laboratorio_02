package br.com.lab2.mvc.pv2.controller;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.lab2.mvc.pv2.model.ClientUser;

@Controller
public class ClientUserController {
	
	//@Autowired
	//private ClientUserRepository repository;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@GetMapping("/client")
	public String home(Model model) {
		
//		javax.persistence.Query query = entityManager.createNamedQuery("SELECT C FROM CLIENTUSER C");
	//	List clientes =  query.getResultList();
		
		//ArrayList<ClientUser> clients = (ArrayList<ClientUser>) repository.findAll();
		//model.addAttribute("clients", clients);
		//return "client";
		
		
		//ery query = entityManager.createQuery("SELECT C FROM CLIENTUSER C", ClientUser.class);
		//ArrayList<ClientUser> clientes = (ArrayList<ClientUser>) query.getResultList();
		//model.addAttribute("clients", clientes);
		//ArrayList<ClientUser> clients = (ArrayList<ClientUser>) repository.findAll();
		//model.addAttribute("clients", clients);
		return "client"; 
	}
}
