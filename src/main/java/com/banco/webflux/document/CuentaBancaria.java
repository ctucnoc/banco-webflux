package com.banco.webflux.document;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "cuentas_bancarias")
public class CuentaBancaria {

    @Id
    private String id;
    private String tipo;
    private double saldo;
    private List<MovimientoCuenta> movimientos;
    private Cliente cliente;
    private boolean activa;
}
