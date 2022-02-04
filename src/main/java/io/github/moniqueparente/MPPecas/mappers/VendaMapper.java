package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.Venda;
import io.github.moniqueparente.MPPecas.dto.request.VendaDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface VendaMapper {

    VendaMapper INSTANCE = Mappers.getMapper(VendaMapper.class);

    Venda venda(VendaDto vendaDto);

    @InheritInverseConfiguration
    VendaDto vendaDto(Venda venda);
}
