package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.dto.request.ItemVendaDtoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperItemVendaAtualizar {

    public void atualizar(ItemVendaDtoRequest itemVendaDtoRequest,@MappingTarget ItemVenda itemVenda);
}
