package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.dto.request.ProdutoDtoRequest;
import io.github.moniqueparente.MPPecas.dto.response.ProdutoDtoResponse;

import java.util.List;

public interface ProdutoServiceInterface {

    ProdutoDtoResponse criar (ProdutoDtoRequest produtoDtoRequest);
    ProdutoDtoResponse atualizar (ProdutoDtoRequest produtoDtoRequest, Integer id);
    void deletar (Integer id);
    List<ProdutoDtoResponse> listar();
    ProdutoDtoResponse obter (Integer id);

}
