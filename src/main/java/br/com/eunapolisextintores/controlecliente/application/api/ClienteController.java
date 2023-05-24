package br.com.eunapolisextintores.controlecliente.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.eunapolisextintores.controlecliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@RestController
@Log4j2
public class ClienteController implements ClienteAPI {

	private final ClienteService clienteService;
	
	@Override
	public ClienteResponse postCliente(ClienteRequest clienteRequest) {
		log.info("[Inicia] Cliente Controller - postCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[Finaliza] Cliente Controller - postCliente");
		return clienteCriado;
	}

	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[Inicia] Cliente Controller - getTodosClientes");
		log.info("[Finaliza] Cliente Controller - getTodosClientes");		
		return null;
	}
}