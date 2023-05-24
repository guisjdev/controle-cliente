package br.com.eunapolisextintores.controlecliente.application.service;

import java.util.List;

import br.com.eunapolisextintores.controlecliente.application.api.ClienteListResponse;
import br.com.eunapolisextintores.controlecliente.application.api.ClienteRequest;
import br.com.eunapolisextintores.controlecliente.application.api.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();

}
