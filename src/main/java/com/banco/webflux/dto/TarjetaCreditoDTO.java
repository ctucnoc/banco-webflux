package com.banco.webflux.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TarjetaCreditoDTO implements Serializable {

	private static final long serialVersionUID = -3327439474091070254L;
	private String id;
	private String tipo;
	private double limiteCredito;
	private double saldoActual;
}
