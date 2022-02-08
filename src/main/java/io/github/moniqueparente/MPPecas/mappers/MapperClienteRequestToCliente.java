package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import io.github.moniqueparente.MPPecas.dto.request.ClienteDtoRequest;
import org.mapstruct.Mapper;


@Mapper
public interface MapperClienteRequestToCliente {

    public Cliente toModel(ClienteDtoRequest clienteDtoRequest);


}
