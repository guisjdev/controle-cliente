package br.com.eunapolisextintores.controlecliente.Cliente.repository;

import java.util.List;

import br.com.eunapolisextintores.controlecliente.Cliente.api.ClienteListResponse;
import br.com.eunapolisextintores.controlecliente.Cliente.domain.Cliente;

public interface ClienteRepository {

	Cliente save(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesCnpj(String cnpj);
	void deletaCliente(Cliente cliente);
	void alteraCliente(Cliente clienteAlterado);
	List<ClienteListResponse> buscaTodosClientes(String cidade);

	
	
}