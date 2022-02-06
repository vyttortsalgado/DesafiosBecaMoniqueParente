package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.dto.request.ItemVendaDtoRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperItemVendaRequestToItemVenda {

    public ItemVenda toModel(ItemVendaDtoRequest itemVendaDtoRequest);
}
