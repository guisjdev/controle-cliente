package br.com.eunapolisextintores.controlecliente.Cliente.domain;

import java.util.List;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CNPJ;

import br.com.eunapolisextintores.controlecliente.Cliente.api.ClienteAteracaoRequest;
import br.com.eunapolisextintores.controlecliente.Cliente.api.ClienteRequest;
import br.com.eunapolisextintores.controlecliente.Recarga.domain.Recarga;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idCliente;
	@NotBlank
	private String nome;
	@CNPJ
	@Column(unique = true)
	private String cnpj;
	@NotBlank
	private String logradouro;
	@NotBlank
	private String cidade;
	@NotBlank
	private String whatsapp;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Recarga> recargas;
	
	public Cliente (ClienteRequest clienteRequest){
		
		this.nome = clienteRequest.getNome();
		this.cnpj = clienteRequest.getCnpj();
		this.logradouro = clienteRequest.getLogradouro();
		this.cidade = clienteRequest.getCidade();
		this.whatsapp = clienteRequest.getWhatsapp();
		this.recargas = clienteRequest.getRecargas();
	}

	public void alteraCliente(ClienteAteracaoRequest alteraCliente) {
		this.nome = alteraCliente.getNome();
		this.logradouro = alteraCliente.getLogradouro();
		this.cidade = alteraCliente.getCidade();
		this.whatsapp = alteraCliente.getWhatsapp();
	}
		
}
