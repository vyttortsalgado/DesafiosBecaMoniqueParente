package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.dto.request.ClienteDto;

import java.util.List;

public interface ClienteServiceInterface {

    ClienteDto criar(ClienteDto clienteDto);
    ClienteDto atualizar (ClienteDto clienteDto, Integer id);
    void deletar (Integer id);
    List<ClienteDto> listar();
    ClienteDto obter (Integer id);
}
