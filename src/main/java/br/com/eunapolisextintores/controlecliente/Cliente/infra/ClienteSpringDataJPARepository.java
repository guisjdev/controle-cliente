package br.com.eunapolisextintores.controlecliente.Cliente.infra;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.eunapolisextintores.controlecliente.Cliente.api.ClienteListResponse;
import br.com.eunapolisextintores.controlecliente.Cliente.domain.Cliente;


public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID>{

	Optional<Object> findByCnpj(String cnpj);
	@Query ("SELECT c FROM Cliente c WHERE c.cidade = :cidade")
	List<ClienteListResponse> findByCidade(String cidade);
	
}