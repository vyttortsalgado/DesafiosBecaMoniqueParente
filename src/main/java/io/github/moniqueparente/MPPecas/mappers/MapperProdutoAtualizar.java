package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.Produto;
import io.github.moniqueparente.MPPecas.dto.request.ProdutoDtoRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public interface MapperProdutoAtualizar {

    public void atualizar(ProdutoDtoRequest produtoDtoRequest,@MappingTarget Produto produto);
}
