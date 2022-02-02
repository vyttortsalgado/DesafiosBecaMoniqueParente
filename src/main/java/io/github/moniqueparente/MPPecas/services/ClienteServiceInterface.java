package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import io.github.moniqueparente.MPPecas.dto.request.ClienteDto;

import java.util.List;

public interface ClienteServiceInterface {

    ClienteDto criar(Cliente cliente);
    Cliente atualizar (ClienteDto clienteDto, Integer id);
    void deletar (Integer id);
    List<ClienteDto> listar();
    ClienteDto obter (Integer id);
}
