package com.banco.webflux.document;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "movimientos_cuenta")
public class MovimientoCuenta {

    @Id
    private String id;
    private String tipoMovimiento; // 'deposito', 'retiro'
    private double monto;
    private Date fechaMovimiento;
    private String descripcion;
}

