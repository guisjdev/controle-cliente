package br.com.eunapolisextintores.controlecliente.Recarga.domain;

import java.time.LocalDate;
import java.util.UUID;

import br.com.eunapolisextintores.controlecliente.Recarga.api.RecargaRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;



	@Entity
	@NoArgsConstructor (access = AccessLevel.PRIVATE)
	@AllArgsConstructor (access = AccessLevel.PRIVATE)
	@Getter
	@ToString
	public class Recarga {
		public Recarga(RecargaRequest recargaRequest) {
			this.apelido = recargaRequest.getApelido();
			this.peso = recargaRequest.getPeso();
			this.tipo = recargaRequest.getTipo();
			this.dataVencimento = recargaRequest.getDataVencimento();
		}
		@Id
		@GeneratedValue (strategy = GenerationType.AUTO)
		private UUID idRecarga;
		@NotBlank
		private String apelido;
		private Integer peso;
		private Tipo tipo;
		@NotNull
		private LocalDate dataVencimento;
				
}