package br.com.eunapolisextintores.controlecliente.Cliente.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.eunapolisextintores.controlecliente.Cliente.api.ClienteAteracaoRequest;
import br.com.eunapolisextintores.controlecliente.Cliente.api.ClienteDetalhadoResponse;
import br.com.eunapolisextintores.controlecliente.Cliente.api.ClienteListResponse;
import br.com.eunapolisextintores.controlecliente.Cliente.api.ClienteRequest;
import br.com.eunapolisextintores.controlecliente.Cliente.api.ClienteResponse;
import br.com.eunapolisextintores.controlecliente.Cliente.domain.Cliente;
import br.com.eunapolisextintores.controlecliente.Cliente.repository.ClienteRepository;
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

	@Override
	public void deletaClienteByCnpj(String cnpj) {
		log.info("[Inicia] deletaClienteByCnpj - deletaCliente");		
		Cliente cliente = clienteRepository.buscaClienteAtravesCnpj(cnpj);
		clienteRepository.deletaCliente(cliente);
		log.info("[Finaliza] deletaClienteByCnpj - deletaCliente");
		
	}

	@Override
	public void patchCliente(String cnpj, ClienteAteracaoRequest clienteAlteracaoRequest) {
		log.info("[Inicia] patchCliente - alteraCliente");		
		Cliente cliente = clienteRepository.buscaClienteAtravesCnpj(cnpj);
		cliente.alteraCliente(clienteAlteracaoRequest);	
		clienteRepository.save(cliente);
		log.info("[Finaliza] patchCliente - alteraCliente");		
		
	}

//	@Override
//	public List<ClientesPorCidade> buscaTodosClientesCidade(String cidade) {
//		log.info("[inicia] ClienteApplicationService - buscaClientesAtravesCidade");
//		List<ClientesPorCidade> clientesCidade = clienteRepository.buscaTodosClientesCidade(cidade);
//		log.info("[inicia] ClienteApplicationService - buscaClientesAtravesCidade");
//		return ClientesPorCidade.convert(clientesCidade);
//	}

}
