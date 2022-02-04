package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.Venda;
import io.github.moniqueparente.MPPecas.dto.request.VendaDto;
import io.github.moniqueparente.MPPecas.mappers.VendaMapper;
import io.github.moniqueparente.MPPecas.repository.VendaRepository;
import io.github.moniqueparente.MPPecas.services.VendaServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class VendaService implements VendaServiceInterface {

    @Autowired
    private VendaRepository vendaRepositorio;

    @Autowired
    private VendaMapper vendaMapper;

    public VendaDto criar(Venda venda) {

        Venda vendasalva = vendaRepositorio.save(venda);

        return vendaMapper.vendaDto(vendasalva);
    }

    public Venda atualizar(VendaDto vendaDto, Integer id) {

        return vendaRepositorio.findById(id)
                .map(venda -> {
                    venda.setVendedor(venda.getVendedor());
                    venda.setCliente(venda.getCliente());
                    venda.setItemVendaLista(vendaDto.getItemVendaLista());
                    return vendaRepositorio.save(venda);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public void deletar (Integer id) {
        vendaRepositorio.deleteById(id);
    }

    public List<VendaDto> listar() {

        List<VendaDto> listaVendaDto = new ArrayList<>();

        vendaRepositorio.findAll().stream()
                .forEach(venda -> listaVendaDto.add(new VendaDto(venda)));

        return listaVendaDto;

    }

    public VendaDto obter (Integer id){

        return new VendaDto(vendaRepositorio.findById(id).get());
    }

}
