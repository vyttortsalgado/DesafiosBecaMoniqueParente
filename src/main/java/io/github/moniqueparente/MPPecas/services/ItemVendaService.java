package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.domains.Produto;
import io.github.moniqueparente.MPPecas.repositorio.MPPecasInterface;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ItemVendaService implements MPPecasInterface<ItemVenda> {

    Produto produto1 = new Produto(1,"Teclado","Redragon");
    Produto produto2 = new Produto(2,"Notebook", "Alienware");
    Produto produto3 = new Produto(3,"Mouse", "Dell");

    public ItemVenda criar (ItemVenda itemVenda){
        itemVenda.setId(1);

        return itemVenda;
    }

    public ItemVenda atualizar ( ItemVenda itemVenda, Integer id){
        itemVenda.setId(id);

        return itemVenda;
    }

    public void deletar (Integer id) {

    }


    public List<ItemVenda> listar() {

        ItemVenda itemv1 = new ItemVenda(1,200.00,1,produto1);
        itemv1.setId(1);
        itemv1.setValor(200.00);
        itemv1.setQuantidade(1);
        itemv1.setProduto(produto1);

        ItemVenda itemv2 = new ItemVenda(2,15000.00,1,produto2);
        itemv2.setId(2);
        itemv2.setValor(15000.00);
        itemv2.setQuantidade(1);
        itemv2.setProduto(produto2);

        ItemVenda itemv3 = new ItemVenda(3,300.00,1,produto3);
        itemv3.setId(3);
        itemv3.setValor(300.00);
        itemv3.setQuantidade(1);
        itemv3.setProduto(produto3);

        List<ItemVenda> itemVendaLista = Arrays.asList(itemv1, itemv2, itemv3);

        return itemVendaLista;

    }


    public ItemVenda obter (Integer id) {
        System.out.println("Obterve id: " +id);

        ItemVenda itemv1 = new ItemVenda(1,200.00,1,produto1);
        itemv1.setId(1);
        itemv1.setValor(200.00);
        itemv1.setQuantidade(1);
        itemv1.setProduto(produto1);

        return itemv1;

    }

}
