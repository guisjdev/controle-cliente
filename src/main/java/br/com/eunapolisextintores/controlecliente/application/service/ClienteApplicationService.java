package br.com.eunapolisextintores.controlecliente.application.service;

import org.springframework.stereotype.Service;

import br.com.eunapolisextintores.controlecliente.application.api.ClienteRequest;
import br.com.eunapolisextintores.controlecliente.application.api.ClienteResponse;
import br.com.eunapolisextintores.controlecliente.application.repository.ClienteRepository;
import br.com.eunapolisextintores.controlecliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteAplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[Finaliza] ClienteAplicationService - criaCliente");
		return ClienteResponse.builder()
			.idCliente(cliente.getIdCliente())
			.build();
	}

}
