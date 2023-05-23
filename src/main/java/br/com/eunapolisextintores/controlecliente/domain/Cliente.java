package br.com.eunapolisextintores.controlecliente.domain;

import java.util.UUID;

import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idCliente;
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
	
	public Cliente(@NotBlank String nome, @NotBlank @CNPJ String cnpj, @NotBlank String logradouro,
			@NotBlank String cidade, @NotBlank String whatsapp) {
	
		this.nome = nome;
		this.cnpj = cnpj;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.whatsapp = whatsapp;
	}
}
