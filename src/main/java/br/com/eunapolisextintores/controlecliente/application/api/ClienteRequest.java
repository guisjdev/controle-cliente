package br.com.eunapolisextintores.controlecliente.application.api;

import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ClienteRequest {

	@NotBlank
	private String nome;
	@NotBlank
	@CNPJ
	private String cnpj;
	@NotBlank
	private String logradouro;
	@NotBlank
	private String cidade;
	@NotBlank
	private String whatsapp;
}
