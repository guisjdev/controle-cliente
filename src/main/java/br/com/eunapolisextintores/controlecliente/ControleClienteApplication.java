package br.com.eunapolisextintores.controlecliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class ControleClienteApplication {

	@GetMapping
	public String getHomeTest() {
		return "API CONTROLE CLIENTE TEST";
	}

	public static void main(String[] args) {
		SpringApplication.run(ControleClienteApplication.class, args);
	}

}
