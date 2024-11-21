package com.banco.webflux.dto.request;

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
public class TarjetaCreditoDTORequest implements Serializable {

	private static final long serialVersionUID = -3327439474091070254L;
	private double limiteCredito;
	private double saldoActual;
}
