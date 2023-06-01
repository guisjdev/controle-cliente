package br.com.eunapolisextintores.controlecliente.Cliente.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.eunapolisextintores.controlecliente.Cliente.domain.Cliente;
import br.com.eunapolisextintores.controlecliente.Recarga.domain.Recarga;
import lombok.Value;

@Value
public class ClienteListResponse {
	private UUID idCliente;
	private String nome;
	private String cnpj;
	private String logradouro;
	private String cidade;
	private List<Recarga> recargas;
	
	public static List<ClienteListResponse> convert(List<Cliente> clientes) {
		return clientes.stream()
				.map(ClienteListResponse::new)
				.collect(Collectors.toList());
	}

	public ClienteListResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nome = cliente.getNome();
		this.cnpj = cliente.getCnpj();
		this.logradouro = cliente.getLogradouro();
		this.cidade = cliente.getCidade();
		this.recargas = cliente.getRecargas();
	}
	
}
