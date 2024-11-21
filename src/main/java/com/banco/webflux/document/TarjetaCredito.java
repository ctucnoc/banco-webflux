package com.banco.webflux.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "tarjetas_credito")
public class TarjetaCredito {

	@Id
	private String id;
	private double limiteCredito;
	private double saldoActual;
}
