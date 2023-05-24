package br.com.eunapolisextintores.controlecliente.application.api;

import java.util.UUID;

import br.com.eunapolisextintores.controlecliente.domain.Cliente;
import lombok.Value;

@Value
public class ClientePorCidadeResponse {
		private UUID idCliente;
		private String nome;
		private String cnpj;
		private String logradouro;
		private String cidade;
		private String whatsapp;

		public ClientePorCidadeResponse(Cliente cliente) {
			this.idCliente = cliente.getIdCliente();
			this.nome = cliente.getNome();
			this.cnpj = cliente.getCnpj();
			this.logradouro = cliente.getLogradouro();
			this.cidade = cliente.getCidade();
			this.whatsapp = cliente.getWhatsapp();
	}
}
