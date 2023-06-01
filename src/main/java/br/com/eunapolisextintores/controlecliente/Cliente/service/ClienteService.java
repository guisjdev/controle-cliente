package br.com.eunapolisextintores.controlecliente.Cliente.service;

import java.util.List;

import br.com.eunapolisextintores.controlecliente.Cliente.api.ClienteDetalhadoResponse;
import br.com.eunapolisextintores.controlecliente.Cliente.api.ClienteListResponse;
import br.com.eunapolisextintores.controlecliente.Cliente.api.ClienteRequest;
import br.com.eunapolisextintores.controlecliente.Cliente.api.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesCnpj(String cnpj);
//	List<ClientesPorCidade> buscaTodosClientesCidade(String cidade);
	void deletaClienteByCnpj(String cnpj);

}
