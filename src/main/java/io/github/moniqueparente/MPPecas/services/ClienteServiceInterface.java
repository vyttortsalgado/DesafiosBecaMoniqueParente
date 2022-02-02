package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.Cliente;

import java.util.List;

public interface ClienteServiceInterface {

    Cliente criar(Cliente cliente);
    Cliente atualizar (Cliente cliente, Integer id);
    void deletar (Integer id);
    List<Cliente> listar();
    Cliente obter (Integer id);
}
