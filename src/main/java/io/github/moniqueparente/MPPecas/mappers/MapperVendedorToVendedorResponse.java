package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.Vendedor;
import io.github.moniqueparente.MPPecas.dto.response.VendedorDtoResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperVendedorToVendedorResponse {

    public VendedorDtoResponse toResponse(Vendedor vendedor);
}
