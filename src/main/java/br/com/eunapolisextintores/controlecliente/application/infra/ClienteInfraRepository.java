package br.com.eunapolisextintores.controlecliente.application.infra;

import org.springframework.stereotype.Repository;

import br.com.eunapolisextintores.controlecliente.application.repository.ClienteRepository;
import br.com.eunapolisextintores.controlecliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		clienteSpringDataJPARepository.save(cliente);
		log.info("[Finaliza] ClienteInfraRepository - salva");
		return cliente;
	}

}