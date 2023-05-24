package br.com.eunapolisextintores.controlecliente.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.eunapolisextintores.controlecliente.application.api.ClienteDetalhadoResponse;
import br.com.eunapolisextintores.controlecliente.application.api.ClienteListResponse;
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
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.save(new Cliente(clienteRequest));
		log.info("[Finaliza] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder()
			.idCliente(cliente.getIdCliente())
			.build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		log.info("[Inicia] ClienteApplicationService - buscaTodosClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[Finaliza] ClienteApplicationService - buscaTodosClientes");
		return ClienteListResponse.convert(clientes);
	}

	@Override
	public ClienteDetalhadoResponse buscaClienteAtravesCnpj(String cnpj) {
		log.info("[inicia] ClienteApplicationService - buscaClienteAtravesCnpj");
		Cliente cliente = clienteRepository.buscaClienteAtravesCnpj(cnpj);
		log.info("[Finaliza] ClienteApplicationService - buscaClienteAtravesCnpj");
		return new ClienteDetalhadoResponse(cliente);
	}

}
