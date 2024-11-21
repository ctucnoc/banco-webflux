package com.banco.webflux.service.impl;

import org.springframework.stereotype.Service;

import com.banco.webflux.dto.TarjetaCreditoDTO;
import com.banco.webflux.dto.request.TarjetaCreditoDTORequest;
import com.banco.webflux.mapper.ITarjetaCreditoMapper;
import com.banco.webflux.repository.ITarjetaCreditoRepository;
import com.banco.webflux.service.ITarjetaCreditoService;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class TarjetaCreditoServiceImpl implements ITarjetaCreditoService{
	
	final
	ITarjetaCreditoRepository tarjetaCreditoRepository;
	
	final
	ITarjetaCreditoMapper tarjetaCreditoMapper;

	public TarjetaCreditoServiceImpl(ITarjetaCreditoRepository tarjetaCreditoRepository, ITarjetaCreditoMapper tarjetaCreditoMapper) {
		this.tarjetaCreditoRepository = tarjetaCreditoRepository;
		this.tarjetaCreditoMapper = tarjetaCreditoMapper;
	}

	@Override
	public Flux<TarjetaCreditoDTO> findAll() {
		return tarjetaCreditoRepository.findAll()
				.doOnNext(bean -> log.info(bean.toString()))
				.map(tarjetaCreditoMapper::toDto)
				.log();
	}

	@Override
	public Mono<TarjetaCreditoDTO> save(TarjetaCreditoDTORequest tarjetaCredito) {
		return tarjetaCreditoRepository.save(tarjetaCreditoMapper.toDocument(tarjetaCredito))
				.map(tarjetaCreditoMapper::toDto).log();
	}

}
