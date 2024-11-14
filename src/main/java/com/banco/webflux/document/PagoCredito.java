package com.banco.webflux.document;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "pagos_credito")
public class PagoCredito {

	@Id
	private String id;
	private double monto;
	private Date fechaPago;
	private String descripcion;
}
