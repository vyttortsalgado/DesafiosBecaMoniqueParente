package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import io.github.moniqueparente.MPPecas.dto.request.ClienteDtoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperClienteAtualizar {

    public void atualizar(ClienteDtoRequest clienteDtoRequest, @MappingTarget Cliente cliente);
}
