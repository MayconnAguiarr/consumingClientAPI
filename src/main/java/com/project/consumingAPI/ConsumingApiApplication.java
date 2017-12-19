package com.project.consumingAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.consumingAPI.controller.ClientController;

@SpringBootApplication
public class ConsumingApiApplication{

	public static void main(String[] args){
		SpringApplication.run(ConsumingApiApplication.class, args);

	}
}
