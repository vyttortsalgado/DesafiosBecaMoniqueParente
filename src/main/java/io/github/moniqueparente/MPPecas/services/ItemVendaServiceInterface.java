package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;

import java.util.List;

public interface ItemVendaServiceInterface {

    ItemVenda criar (ItemVenda itemVenda);
    ItemVenda atualizar(ItemVenda itemVenda, Integer id);
    void deletar (Integer id);
    List<ItemVenda> listar();
    ItemVenda obter (Integer id);
}
