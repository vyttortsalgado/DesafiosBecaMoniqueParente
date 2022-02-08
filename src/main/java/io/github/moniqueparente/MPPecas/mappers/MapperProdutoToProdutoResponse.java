package io.github.moniqueparente.MPPecas.mappers;

import io.github.moniqueparente.MPPecas.domains.Produto;
import io.github.moniqueparente.MPPecas.dto.response.ProdutoDtoResponse;
import org.mapstruct.Mapper;

@Mapper
public interface MapperProdutoToProdutoResponse {

   public ProdutoDtoResponse toResponse(Produto produto);
}
