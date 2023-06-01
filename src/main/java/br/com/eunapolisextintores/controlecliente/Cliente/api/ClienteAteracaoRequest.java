package br.com.eunapolisextintores.controlecliente.Cliente.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class ClienteAteracaoRequest {

	@NotBlank
	private String nome;
	@NotBlank
	private String logradouro;
	@NotBlank
	private String cidade;
	@NotBlank
	private String whatsapp;
	
	
}
