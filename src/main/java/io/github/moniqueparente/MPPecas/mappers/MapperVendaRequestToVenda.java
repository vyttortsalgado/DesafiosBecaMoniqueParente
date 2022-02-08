package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.Venda;
import io.github.moniqueparente.MPPecas.dto.request.VendaDtoRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperVendaRequestToVenda {

    public Venda toModel(VendaDtoRequest vendaDtoRequest);
}
