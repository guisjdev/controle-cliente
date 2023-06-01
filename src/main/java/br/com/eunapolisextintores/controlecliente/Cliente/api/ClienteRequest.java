package br.com.eunapolisextintores.controlecliente.Cliente.api;

import java.util.List;

import org.hibernate.validator.constraints.br.CNPJ;

import br.com.eunapolisextintores.controlecliente.Recarga.domain.Recarga;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class ClienteRequest {

	@NotBlank
	private String nome;
	@CNPJ
	@Column(unique = true)
	private String cnpj;
	@NotBlank
	private String logradouro;
	@NotBlank
	private String cidade;
	@NotBlank
	private String whatsapp;	
	private List<Recarga> recargas;
}
