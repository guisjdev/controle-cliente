package br.com.eunapolisextintores.controlecliente.Recarga.api;

import jakarta.validation.Valid;

public interface RecargaService {

	RecargaResponse criaRecarga(@Valid RecargaRequest recargaRequest);

}
