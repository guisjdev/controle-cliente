package br.com.eunapolisextintores.controlecliente.application.api;

import java.util.UUID;

import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nome;
	private String cnpj;
	private String logradouro;
	private String cidade;
	private String whatsapp;
	
}
