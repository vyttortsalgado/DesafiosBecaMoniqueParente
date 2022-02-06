package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.Produto;
import io.github.moniqueparente.MPPecas.dto.request.ProdutoDtoRequest;
import org.mapstruct.Mapper;

@Mapper
public interface MapperProdutoRequestToProduto {

    public Produto toModel(ProdutoDtoRequest produtoDtoRequest);

}
