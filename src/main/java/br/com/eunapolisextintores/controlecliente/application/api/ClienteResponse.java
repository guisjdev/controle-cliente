package br.com.eunapolisextintores.controlecliente.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ClienteResponse {
	private UUID idCliente;
}
