package com.banco.webflux.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "clientes")
public class Cliente {

    @Id
    private String id;
    private String nombre;
    private String tipo; // 'personal' o 'empresarial'
    private List<CuentaBancaria> cuentasBancarias;
    private List<ProductoCredito> productosCredito;
    private List<TarjetaCredito> tarjetasCredito;
}

