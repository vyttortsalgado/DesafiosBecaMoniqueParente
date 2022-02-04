package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.dto.request.ItemVendaDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ItemVendaMapper {

    ItemVendaMapper INSTANCE = Mappers.getMapper(ItemVendaMapper.class);

    ItemVenda itemVenda (ItemVendaDto itemVendaDto);

    @InheritInverseConfiguration
    ItemVendaDto itemVendaDto (ItemVenda itemVenda);
}
