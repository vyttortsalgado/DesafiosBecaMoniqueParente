package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.Vendedor;
import io.github.moniqueparente.MPPecas.dto.request.VendedorDtoRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperVendedorRequestToVendedor {

    public Vendedor toModel(VendedorDtoRequest vendedorDtoRequest);
}
