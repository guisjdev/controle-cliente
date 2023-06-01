package br.com.eunapolisextintores.controlecliente.Recarga.api;

import java.time.LocalDate;

import br.com.eunapolisextintores.controlecliente.Recarga.domain.Tipo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;


@Value
public class RecargaRequest {

	@NotBlank
	private String apelido;
	private Integer peso;
	private Tipo tipo;
	@NotNull
	private LocalDate dataVencimento;
	
		
}
