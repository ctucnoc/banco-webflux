package com.banco.webflux.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "productos_credito")
public class ProductoCredito {

    @Id
    private String id;
    private String tipo; // 'personal' o 'empresarial'
    private double limiteCredito;
    private double saldoDeuda;
    private List<PagoCredito> pagos;
}

