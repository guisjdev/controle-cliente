package br.com.eunapolisextintores.controlecliente.Recarga.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Recargas")
public interface RecargaApi {

	@PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    RecargaResponse postRecarga(@Valid @RequestBody RecargaRequest recargaRequest);
    
}