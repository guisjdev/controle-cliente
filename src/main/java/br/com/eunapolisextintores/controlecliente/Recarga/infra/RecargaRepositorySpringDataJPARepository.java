package br.com.eunapolisextintores.controlecliente.Recarga.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.eunapolisextintores.controlecliente.Recarga.domain.Recarga;

public interface RecargaRepositorySpringDataJPARepository extends JpaRepository<Recarga, UUID> {

}
