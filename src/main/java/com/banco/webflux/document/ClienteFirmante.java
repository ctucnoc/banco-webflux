package com.banco.webflux.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "clientes_firmantes")
public class ClienteFirmante {

    @Id
    private String id;
    private Cliente cliente;
    private boolean esFirmanteAutorizado;
}
