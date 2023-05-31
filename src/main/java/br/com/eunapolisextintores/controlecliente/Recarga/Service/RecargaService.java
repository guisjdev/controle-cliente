package br.com.eunapolisextintores.controlecliente.Recarga.Service;

import br.com.eunapolisextintores.controlecliente.Recarga.api.RecargaRequest;
import br.com.eunapolisextintores.controlecliente.Recarga.api.RecargaResponse;
import jakarta.validation.Valid;

public interface RecargaService {

	RecargaResponse criaRecarga(@Valid RecargaRequest recargaRequest);

}
