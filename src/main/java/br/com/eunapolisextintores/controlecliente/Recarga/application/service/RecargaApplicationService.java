package br.com.eunapolisextintores.controlecliente.Recarga.application.service;

import org.springframework.stereotype.Service;

import br.com.eunapolisextintores.controlecliente.Recarga.api.RecargaRequest;
import br.com.eunapolisextintores.controlecliente.Recarga.api.RecargaResponse;
import br.com.eunapolisextintores.controlecliente.Recarga.api.RecargaService;
import br.com.eunapolisextintores.controlecliente.Recarga.domain.Recarga;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class RecargaApplicationService implements RecargaService {

	private final RecargaRepository recargaRepository;

	@Override
	public RecargaResponse criaRecarga(RecargaRequest recargaRequest) {
	    log.info("[start] RecargaApplicationService - criaRecarga");
	    Recarga recarga = recargaRepository.salva(new Recarga(recargaRequest));
	    log.info("[finish] RecargaApplicationService - criaRecarga");
	    return RecargaResponse.builder()
	    		.idRecarga(recarga.getIdRecarga())
	    		.build();
	}

}
