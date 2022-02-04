package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.dto.request.ProdutoDto;

import java.util.List;

public interface ProdutoServiceInterface {

    ProdutoDto criar (ProdutoDto produtoDto);
    ProdutoDto atualizar (ProdutoDto produtoDto, Integer id);
    void deletar (Integer id);
    List<ProdutoDto> listar();
    ProdutoDto obter (Integer id);

}
