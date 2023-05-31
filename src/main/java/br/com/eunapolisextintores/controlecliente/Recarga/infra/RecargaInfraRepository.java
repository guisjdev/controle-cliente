package br.com.eunapolisextintores.controlecliente.Recarga.infra;

import org.springframework.stereotype.Repository;

import br.com.eunapolisextintores.controlecliente.Recarga.application.service.RecargaRepository;
import br.com.eunapolisextintores.controlecliente.Recarga.domain.Recarga;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class RecargaInfraRepository implements RecargaRepository {

	@Override
	public Recarga salva(Recarga recarga) {
	    log.info("[start] RecargaInfraRepository - salva");
	    log.info("[finish] RecargaInfraRepository - salva");
		return recarga;
	}	
}
