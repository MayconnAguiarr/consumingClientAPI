package com.project.consumingAPI.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Client{

	private Long id;

	private String name;

	private String cpf;

	private String address;	

	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date birthDay;	

	private String obs;
	
	private City city;

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

	public String getCpf(){
		return cpf;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public String getAddress(){
		return address;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public Date getBirthDay(){
		return birthDay;
	}

	public void setBirthDay(Date birthDay){
		this.birthDay = birthDay;
	}

	public String getObs(){
		return obs;
	}

	public void setObs(String obs){
		this.obs = obs;
	}

	public City getCity(){
		return city;
	}

	public void setCity(City city){
		this.city = city;
	}		
}
