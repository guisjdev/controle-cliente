package br.com.eunapolisextintores.controlecliente.Recarga.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class RecargaResponse {	
	private UUID idRecarga;
}
