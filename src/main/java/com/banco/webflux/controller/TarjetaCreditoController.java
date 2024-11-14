package com.banco.webflux.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.banco.webflux.dto.TarjetaCreditoDTO;
import com.banco.webflux.service.ITarjetaCreditoService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/tarjeta-creditos")
public class TarjetaCreditoController {

	final
	ITarjetaCreditoService tarjetaCreditoService;

	public TarjetaCreditoController(ITarjetaCreditoService tarjetaCreditoService) {
		this.tarjetaCreditoService = tarjetaCreditoService;
	}
	
	@GetMapping("/findAll")
	public Mono<ResponseEntity<Flux<TarjetaCreditoDTO>>> findAll(){
		return Mono.just(ResponseEntity.ok().body(tarjetaCreditoService.findAll())).log();
	}
	
}