package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.Vendedor;
import io.github.moniqueparente.MPPecas.dto.request.VendedorDtoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperVendedorAtualizar {

    public void atualizar(VendedorDtoRequest vendedorDtoRequest, @MappingTarget Vendedor vendedor);
}
