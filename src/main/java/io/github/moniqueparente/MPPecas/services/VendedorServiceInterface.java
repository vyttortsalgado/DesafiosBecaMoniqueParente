package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.Vendedor;

import java.util.List;

public interface VendedorServiceInterface {

    Vendedor criar (Vendedor vendedor);
    Vendedor atualizar (Vendedor vendedor, Integer id);
    void deletar (Integer id);
    List<Vendedor> listar();
    Vendedor obter (Integer id);

}
