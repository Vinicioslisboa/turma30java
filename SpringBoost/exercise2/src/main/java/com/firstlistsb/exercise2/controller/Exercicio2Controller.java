package com.firstlistsb.exercise2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Exercicio2Controller {
	
	@GetMapping("/objsemanal")
	
	public String sayObjetivoSemanal() {
		
		return "<strong>Objetivos Semanal:</strong><br> Dominar Spring boot<br> Revisar Java.";
	}

}
