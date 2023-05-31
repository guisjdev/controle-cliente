package br.com.eunapolisextintores.controlecliente.Recarga.api;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class RecargaController implements RecargaApi {

	private final RecargaService recargaService;

	@Override
	public RecargaResponse postRecarga(@Valid RecargaRequest recargaRequest) {
	    log.info("[start] RecargaController - postRecarga");
		RecargaResponse recargaCriada = recargaService.criaRecarga(recargaRequest);
	    log.info("[finish] RecargaController - postRecarga");
		return recargaCriada;
	}
}
