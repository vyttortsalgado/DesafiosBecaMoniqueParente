package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.dto.request.ItemVendaDto;
import io.github.moniqueparente.MPPecas.mappers.ItemVendaMapper;
import io.github.moniqueparente.MPPecas.repository.ItemVendaRepository;
import io.github.moniqueparente.MPPecas.services.ItemVendaServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemVendaService implements ItemVendaServiceInterface {

    @Autowired
    private ItemVendaRepository itemVendaRepositorio;

    @Autowired
    private ItemVendaMapper itemVendaMapper;

    public ItemVendaDto criar (ItemVenda itemVenda){

        ItemVenda itemvendasalvo =itemVendaRepositorio.save(itemVenda);

        return itemVendaMapper.itemVendaDto(itemvendasalvo);
    }

    public ItemVenda atualizar(ItemVendaDto itemVendaDto, Integer id){

        return itemVendaRepositorio.findById(id)
                .map(itemVenda -> {
                    itemVenda.setValor(itemVendaDto.getValor());
                    itemVenda.setQuantidade(itemVendaDto.getQuantidade());
                    itemVenda.setProduto(itemVendaDto.getProduto());
                    return itemVendaRepositorio.save(itemVenda);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public void deletar (Integer id) {
        itemVendaRepositorio.deleteById(id);
    }


    public List<ItemVendaDto> listar() {

        List<ItemVendaDto> listaItemVendaDto = new ArrayList<>();

        itemVendaRepositorio.findAll().stream()
                .forEach(itemVenda -> listaItemVendaDto.add(new ItemVendaDto(itemVenda)));

        return listaItemVendaDto;
    }


    public ItemVendaDto obter (Integer id) {

        return new ItemVendaDto(itemVendaRepositorio.findById(id).get());
    }

}
