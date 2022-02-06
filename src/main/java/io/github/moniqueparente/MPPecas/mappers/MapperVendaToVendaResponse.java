package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.Venda;
import io.github.moniqueparente.MPPecas.dto.response.VendaDtoResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperVendaToVendaResponse {

    public VendaDtoResponse toResponse(Venda venda);
}
