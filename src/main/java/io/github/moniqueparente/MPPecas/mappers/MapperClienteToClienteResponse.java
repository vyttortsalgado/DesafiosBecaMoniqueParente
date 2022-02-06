package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import io.github.moniqueparente.MPPecas.dto.response.ClienteDtoResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperClienteToClienteResponse {

    public ClienteDtoResponse toResponse (Cliente cliente);
}
