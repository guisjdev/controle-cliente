package br.com.eunapolisextintores.controlecliente.application.repository;

import java.util.List;

import br.com.eunapolisextintores.controlecliente.domain.Cliente;

public interface ClienteRepository {

	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
}