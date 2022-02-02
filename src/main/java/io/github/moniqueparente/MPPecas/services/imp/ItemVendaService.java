package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.repositorio.ItemVendaRepository;
import io.github.moniqueparente.MPPecas.services.ItemVendaServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemVendaService implements ItemVendaServiceInterface {

    @Autowired
    private ItemVendaRepository itemVendaRepositorio;
    private Integer id;

    public ItemVenda criar (ItemVenda itemVenda){
        ItemVenda itemVendaSalvo = itemVendaRepositorio.save(itemVenda);

        return itemVendaSalvo;
    }

    public ItemVenda atualizar(ItemVenda itemVenda, Integer id){

        ItemVenda itemVendaObtido = this.obter(id);
        itemVendaObtido.setValor(itemVendaObtido.getValor());
        itemVendaObtido.setQuantidade(itemVendaObtido.getQuantidade());
        itemVendaObtido.setProduto(itemVendaObtido.getProduto());

        itemVendaRepositorio.save(itemVendaObtido);

        return itemVenda;
    }

    public void deletar (Integer id) {
        itemVendaRepositorio.deleteById(id);
    }


    public List<ItemVenda> listar() {
        List<ItemVenda> itemVendaListada = itemVendaRepositorio.findAll();

        return  itemVendaListada;
    }


    public ItemVenda obter (Integer id) {

        Optional<ItemVenda> obj = itemVendaRepositorio.findById(id);

        return obj.get();
    }

}
