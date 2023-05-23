package br.com.eunapolisextintores.controlecliente.application.repository;

import br.com.eunapolisextintores.controlecliente.domain.Cliente;

public interface ClienteRepository {
	
	Cliente salva(Cliente cliente);
}