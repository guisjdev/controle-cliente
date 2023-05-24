package br.com.eunapolisextintores.controlecliente.application.repository;

import java.util.List;

import br.com.eunapolisextintores.controlecliente.domain.Cliente;

public interface ClienteRepository {

	Cliente save(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesCnpj(String cnpj);
}