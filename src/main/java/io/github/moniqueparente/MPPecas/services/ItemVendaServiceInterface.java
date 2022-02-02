package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.dto.request.ItemVendaDto;

import java.util.List;

public interface ItemVendaServiceInterface {

    ItemVendaDto criar (ItemVenda itemVenda);
    ItemVenda atualizar(ItemVendaDto itemVendaDto, Integer id);
    void deletar (Integer id);
    List<ItemVendaDto> listar();
    ItemVendaDto obter (Integer id);
}
