package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import io.github.moniqueparente.MPPecas.dto.request.ClienteDtoRequest;
import io.github.moniqueparente.MPPecas.dto.response.ClienteDtoResponse;

import java.util.List;

public interface ClienteServiceInterface {

    ClienteDtoResponse criar(ClienteDtoRequest clienteDtoResquest);
    ClienteDtoResponse atualizar (ClienteDtoRequest clienteDtoResquest, Integer id);
    void deletar (Integer id);
    List<ClienteDtoResponse> listar();
    Cliente obter (Integer id);
}
