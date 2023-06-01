package br.com.eunapolisextintores.controlecliente.Cliente.infra;

import java.util.List;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.eunapolisextintores.controlecliente.Cliente.domain.Cliente;
import br.com.eunapolisextintores.controlecliente.Cliente.repository.ClienteRepository;
import br.com.eunapolisextintores.controlecliente.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;
	
	@Override
	public Cliente save(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - save");
			try {
				clienteSpringDataJPARepository.save(cliente);			
			} catch (DataIntegrityViolationException e) {
				throw APIException.build(HttpStatus.BAD_REQUEST, "Existem dados duplicados");
			}
		log.info("[Finaliza] ClienteInfraRepository - save");
		return cliente;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[inicia] ClienteInfraRepository - buscaTodosClientes");
		List<Cliente> todosClientes = clienteSpringDataJPARepository.findAll();
		log.info("[Finaliza] ClienteInfraRepository - buscaTodosClientes");
		return todosClientes;
	}

	@Override
	public Cliente buscaClienteAtravesCnpj(String cnpj) {
		log.info("[inicia] ClienteInfraRepository - buscaClienteAtravesCnpj");
		Cliente cliente = (Cliente) clienteSpringDataJPARepository.findByCnpj(cnpj)
				.orElseThrow(()-> APIException.build(HttpStatus.BAD_REQUEST, "Empresa não encontrada!"));
		log.info("[finaliza] ClienteInfraRepository - buscaClienteAtravesCnpj");
		return cliente;
	}

	@Override
	public void deletaCliente(Cliente cliente) {
		log.info("[Inicia] deletaClienteByCnpj - deletaCliente");
		clienteSpringDataJPARepository.delete(cliente);
		log.info("[Finaliza] deletaClienteByCnpj - deletaCliente");
		
	}

//	@Override
//	public List<ClientesPorCidade> buscaTodosClientesCidade(String cidade) {
//		log.info("[inicia] ClienteInfraRepository - buscaClientesAtravesCidade");
//		log.info("[Finaliza] ClienteInfraRepository - buscaClientesAtravesCidade");
//		return null;
//	}

}
