package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.Vendedor;
import io.github.moniqueparente.MPPecas.dto.request.VendedorDto;

import java.util.List;

public interface VendedorServiceInterface {

    VendedorDto criar (Vendedor vendedor);
    Vendedor atualizar (VendedorDto vendedorDto, Integer id);
    void deletar (Integer id);
    List<VendedorDto> listar();
    VendedorDto obter (Integer id);

}
