package br.com.eunapolisextintores.controlecliente.Cliente.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ClienteResponse {
	private UUID idCliente;
}
