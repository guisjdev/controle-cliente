package br.com.eunapolisextintores.controlecliente.Cliente.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.eunapolisextintores.controlecliente.Cliente.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@RestController
@Log4j2
public class ClienteController implements ClienteAPI {

	private final ClienteService clienteService;
	
	@Override
	public ClienteResponse postCliente(ClienteRequest clienteRequest) {
		log.info("[Inicia] ClienteController - postCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[Finaliza] ClienteController - postCliente");
		return clienteCriado;
	}

	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[Inicia] ClienteController - getTodosClientes");
		List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
		log.info("[Finaliza] Cliente Controller - getTodosClientes");		
		return clientes;
	}

	@Override
	public ClienteDetalhadoResponse getAtravesCnpj(String cnpj) {
		log.info("[Inicia] ClienteController - getAtravesCnpj");
		log.info("[cnpj] {}", cnpj);
		ClienteDetalhadoResponse ClienteDetalhadoPorCnpj = clienteService.buscaClienteAtravesCnpj(cnpj);
		log.info("[Finaliza] ClienteController - getAtravesCnpj");
		return ClienteDetalhadoPorCnpj;
	}

	@Override
	public void deletaClienteByCnpj(String cnpj) {
		log.info("[Inicia] deletaClienteByCnpj - deletaCliente");
		log.info("[cnpj] {}", cnpj);
		clienteService.deletaClienteByCnpj(cnpj);
		log.info("[Finaliza] deletaClienteByCnpj - deletaCliente");
		
	}

//	@Override
//	public List<ClientesPorCidade> getAtravesCidade(String cidade) {
//		log.info("[Inicia] ClienteController - buscaAtravesCidade");
//		log.info("[CIDADE] {}", cidade);
//		List<ClientesPorCidade> clientesPorCidade = clienteService.buscaTodosClientesCidade(cidade);
//		log.info("[Finaliza] ClienteController - buscaAtravesCidade");
//		return clientesPorCidade;
//	}
}