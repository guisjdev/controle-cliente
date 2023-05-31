package br.com.eunapolisextintores.controlecliente.Recarga.application.service;

import org.springframework.stereotype.Service;

import br.com.eunapolisextintores.controlecliente.Recarga.api.RecargaRequest;
import br.com.eunapolisextintores.controlecliente.Recarga.api.RecargaResponse;
import br.com.eunapolisextintores.controlecliente.Recarga.api.RecargaService;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class RecargaApplicationService implements RecargaService {

	@Override
	public RecargaResponse criaRecarga(@Valid RecargaRequest recargaRequest) {
	    log.info("[start] RecargaApplicationService - criaRecarga");
	    log.info("[finish] RecargaApplicationService - criaRecarga");
	    return null;
	}

}
