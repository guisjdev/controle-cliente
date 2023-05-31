package br.com.eunapolisextintores.controlecliente.Recarga.infra;

import org.springframework.stereotype.Repository;

import br.com.eunapolisextintores.controlecliente.Recarga.domain.Recarga;
import br.com.eunapolisextintores.controlecliente.Recarga.repository.RecargaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class RecargaInfraRepository implements RecargaRepository {

	private final RecargaRepositorySpringDataJPARepository recargaSpringDataJPARepository;

	@Override
	public Recarga salva(Recarga recarga) {
	    log.info("[start] RecargaInfraRepository - salva");
	    recargaSpringDataJPARepository.save(recarga);
	    log.info("[finish] RecargaInfraRepository - salva");
		return recarga;
	}	
}
