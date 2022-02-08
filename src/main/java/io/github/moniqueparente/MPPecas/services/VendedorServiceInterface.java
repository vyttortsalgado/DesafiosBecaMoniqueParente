package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.dto.request.VendedorDtoRequest;
import io.github.moniqueparente.MPPecas.dto.response.VendedorDtoResponse;

import java.util.List;

public interface VendedorServiceInterface {

    VendedorDtoResponse criar (VendedorDtoRequest vendedorDtoRequest);
    VendedorDtoResponse atualizar (VendedorDtoRequest vendedorDtoRequest, Integer id);
    void deletar (Integer id);
    List<VendedorDtoResponse> listar();
    VendedorDtoResponse obter (Integer id);

}
