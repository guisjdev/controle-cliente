package br.com.eunapolisextintores.controlecliente.Cliente.infra;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eunapolisextintores.controlecliente.Cliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID>{

	Optional<Object> findByCnpj(String cnpj);
}
