package com.firstlistsb.exercise1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Exercise1Controller {
	
	@GetMapping("/mentandhab")
		
		public String sayMentandHab() {
			
			return" <strong>Mentalidades:</strong> Persistência.<br><strong>Habilidades:</strong> Orientação ao detalhe.";
		}
	
	
}