package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.Venda;
import io.github.moniqueparente.MPPecas.dto.request.VendaDto;

import java.util.List;

public interface VendaServiceInterface {

    VendaDto criar(Venda venda);
    Venda atualizar(VendaDto vendaDto, Integer id);
    void deletar (Integer id);
    List<VendaDto> listar();
    VendaDto obter (Integer id);
}
