package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.Vendedor;
import io.github.moniqueparente.MPPecas.dto.request.VendedorDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface VendedorMapper {

    VendedorMapper INSTANCE = Mappers.getMapper(VendedorMapper.class);

    Vendedor vendedor (VendedorDto vendedorDto);

    @InheritInverseConfiguration
    VendedorDto vendedorDto (Vendedor vendedor);
}
