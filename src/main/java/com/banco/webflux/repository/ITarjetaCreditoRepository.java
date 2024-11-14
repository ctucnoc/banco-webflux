package com.banco.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import com.banco.webflux.document.TarjetaCredito;

@Repository
public interface ITarjetaCreditoRepository extends ReactiveMongoRepository<TarjetaCredito, String>{

}
