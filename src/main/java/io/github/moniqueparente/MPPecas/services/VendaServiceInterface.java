package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.Venda;

import java.util.List;

public interface VendaServiceInterface {

    Venda criar(Venda venda);
    Venda atualizar(Venda venda, Integer id);
    void deletar (Integer id);
    List<Venda> listar();
    Venda obter (Integer id);
}
