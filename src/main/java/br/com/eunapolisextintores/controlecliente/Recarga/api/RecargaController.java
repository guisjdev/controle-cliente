package br.com.eunapolisextintores.controlecliente.Recarga.api;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class RecargaController implements RecargaApi {

	@Override
	public RecargaResponse postRecarga(@Valid RecargaRequest recargaRequest) {
	    log.info("[start] RecargaController - postRecarga");
	    log.info("[finish] RecargaController - postRecarga");
		return null;
	}

}
