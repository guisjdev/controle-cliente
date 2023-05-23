package br.com.eunapolisextintores.controlecliente.application.service;

import org.springframework.stereotype.Service;

import br.com.eunapolisextintores.controlecliente.application.api.ClienteRequest;
import br.com.eunapolisextintores.controlecliente.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;


@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteAplicationService - criaCliente");
		log.info("[Finaliza] ClienteAplicationService - criaCliente");
		return null;
	}

}
