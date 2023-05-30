package br.com.eunapolisextintores.controlecliente.Cliente.api;
//package br.com.eunapolisextintores.controlecliente.application.api;
//
//import java.util.List;
//import java.util.UUID;
//import java.util.stream.Collectors;
//
//import br.com.eunapolisextintores.controlecliente.domain.Cliente;
//import lombok.Value;
//
//@Value
//public class ClientesPorCidade {
//	private UUID idCliente;
//	private String nome;
//	private String cnpj;
//	private String logradouro;
//	private String cidade;
//	private String whatsapp;
//
//	public static List<ClientesPorCidade> convert(List<ClientesPorCidade> clientesCidade) {
//		return clientesCidade.stream()
//				.map(ClientesPorCidade::new)
//				.collect(Collectors.toList());
//	}
//	
//	public ClientesPorCidade(Cliente cliente) {
//		this.idCliente = cliente.getIdCliente();
//		this.nome = cliente.getNome();
//		this.cnpj = cliente.getCnpj();
//		this.logradouro = cliente.getLogradouro();
//		this.cidade = cliente.getCidade();
//		this.whatsapp = cliente.getWhatsapp();
//	}
//
//}
