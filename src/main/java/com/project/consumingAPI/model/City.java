package com.project.consumingAPI.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class City{

	private Long id;

	private String name;

	@JsonIgnore
	private List<Client> clients;

	public Long getId(){
		return id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public List<Client> getClients(){
		return clients;
	}

	public void setClients(List<Client> clients){
		this.clients = clients;
	}		
}
