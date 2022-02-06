package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.dto.request.ItemVendaDtoRequest;
import io.github.moniqueparente.MPPecas.dto.response.ItemVendaDtoResponse;

import java.util.List;

public interface ItemVendaServiceInterface {

    ItemVendaDtoResponse criar (ItemVendaDtoRequest itemVendaDtoRequest);
    ItemVendaDtoResponse atualizar(ItemVendaDtoRequest itemVendaDtoRequest, Integer id);
    void deletar (Integer id);
    List<ItemVendaDtoResponse> listar();
    ItemVendaDtoResponse obter (Integer id);
}
