package com.project.consumingAPI.controller;

import java.net.URI;
import java.util.Arrays;
import java.util.Base64;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.project.consumingAPI.model.Client;

@Controller
@RequestMapping(value = "/clients")
public class ClientController{

	private RestTemplate restTemplate;
	private ModelAndView modelAndView;
	
	private String URI_BASE;
	private String URN_BASE = "/clients";
	private String credencial;	
	private String url = "http://localhost:8080";;
	private String usuario = "maycon";
	private String senha = "aguiar";

	public ClientController(){				
		
		restTemplate = new RestTemplate();

		URI_BASE = url.concat(URN_BASE);

		String credencialAux = usuario + ":" + senha;

		credencial = "Basic " + Base64.getEncoder().encodeToString(credencialAux.getBytes());
	}

	@GetMapping
	public ModelAndView list(){		
	
		modelAndView = new ModelAndView("clients/client");
		
		RequestEntity<Void> request = RequestEntity.get(URI.create(URI_BASE + "/listar"))
				.header("Authorization", credencial).build();
		
		ResponseEntity<Client[]> response = restTemplate.exchange(request, Client[].class);

		 modelAndView.addObject("clients", Arrays.asList(response.getBody()));
		 
		 return modelAndView;		
	}
}
