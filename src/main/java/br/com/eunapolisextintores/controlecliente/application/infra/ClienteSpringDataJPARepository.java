package br.com.eunapolisextintores.controlecliente.application.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eunapolisextintores.controlecliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID>{

}
