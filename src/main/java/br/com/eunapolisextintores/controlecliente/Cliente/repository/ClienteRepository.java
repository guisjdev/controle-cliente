package br.com.eunapolisextintores.controlecliente.Cliente.repository;

import java.util.List;

import br.com.eunapolisextintores.controlecliente.Cliente.domain.Cliente;

public interface ClienteRepository {

	Cliente save(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesCnpj(String cnpj);
//	List<ClientesPorCidade> buscaTodosClientesCidade(String cidade);
	void deletaCliente(Cliente cliente);
	void alteraCliente(Cliente clienteAlterado);
	
	
}