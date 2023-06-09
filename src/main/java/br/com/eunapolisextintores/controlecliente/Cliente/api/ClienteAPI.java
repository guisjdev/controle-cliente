package br.com.eunapolisextintores.controlecliente.Cliente.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("v1/cliente")
public interface ClienteAPI {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ClienteResponse postCliente(@Valid @RequestBody ClienteRequest clienteRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<ClienteListResponse> getTodosClientes();

	@GetMapping(value = "/{cnpj}")
	@ResponseStatus(code = HttpStatus.OK)
	ClienteDetalhadoResponse getAtravesCnpj(@PathVariable String cnpj);

	@DeleteMapping(value = "/{cnpj}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaClienteByCnpj(@PathVariable String cnpj);

	@PatchMapping(value = "/{cnpj}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void PatchCliente (@PathVariable String cnpj,
			@Valid @RequestBody ClienteAteracaoRequest clienteAlteracaoRequest);

	@GetMapping(value = "/{cidade}/")
	@ResponseStatus(code = HttpStatus.OK)
	List<ClienteListResponse> buscaPorCidade(@PathVariable String cidade);
}
