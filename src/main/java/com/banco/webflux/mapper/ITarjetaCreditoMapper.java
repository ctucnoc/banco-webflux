package com.banco.webflux.mapper;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import com.banco.webflux.document.TarjetaCredito;
import com.banco.webflux.dto.TarjetaCreditoDTO;
import com.banco.webflux.dto.request.TarjetaCreditoDTORequest;

@Mapper(builder = @Builder(disableBuilder = false))
public interface ITarjetaCreditoMapper {

	TarjetaCreditoDTO toDto(TarjetaCredito tarjetaCredito);
	
	TarjetaCredito toDocument(TarjetaCreditoDTORequest creditoDTO);
	
}
