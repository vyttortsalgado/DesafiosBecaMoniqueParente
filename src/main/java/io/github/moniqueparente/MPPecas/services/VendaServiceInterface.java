package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.dto.request.VendaDtoRequest;
import io.github.moniqueparente.MPPecas.dto.response.VendaDtoResponse;

import java.util.List;

public interface VendaServiceInterface {

    VendaDtoResponse criar(VendaDtoRequest vendaDtoRequest);
    VendaDtoResponse atualizar(VendaDtoRequest vendaDtoRequest, Integer id);
    void deletar (Integer id);
    List<VendaDtoResponse> listar();
    VendaDtoResponse obter (Integer id);
}
