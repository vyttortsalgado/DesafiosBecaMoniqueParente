package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.dto.response.ItemVendaDtoResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperItemVendaToItemVendaResponse {

    public ItemVendaDtoResponse toResponse(ItemVenda itemVenda);
}
