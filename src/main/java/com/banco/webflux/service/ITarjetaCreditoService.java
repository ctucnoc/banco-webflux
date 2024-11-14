package com.banco.webflux.service;

import com.banco.webflux.dto.TarjetaCreditoDTO;
import com.banco.webflux.dto.request.TarjetaCreditoDTORequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITarjetaCreditoService {

	Flux<TarjetaCreditoDTO> findAll();
	
	Mono<TarjetaCreditoDTO> save(TarjetaCreditoDTORequest tarjetaCredito);
}
