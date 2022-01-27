package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.*;
import io.github.moniqueparente.MPPecas.repositorio.MPPecasInterface;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class VendaService implements MPPecasInterface<Venda> {

    Vendedor vendedor1 = new Vendedor(1, "Eliezer");
    Cliente cliente1 = new Cliente(1, "Monique", "777.777.777-77");
    Produto produto1 = new Produto(1, "Teclado", "Redragon");
    ItemVenda itemv1 = new ItemVenda(1, 200.00, 1, produto1);

    Vendedor vendedor2 = new Vendedor(2, "Geovane");
    Cliente cliente2 = new Cliente(2, "Laura", "999.999.999-99");
    Produto produto2 = new Produto(2, "Notebook", "Alienware");
    ItemVenda itemv2 = new ItemVenda(2, 15000.00, 1, produto2);


    Vendedor vendedor3 = new Vendedor(3, "Yuna");
    Cliente cliente3 = new Cliente(3, "Daniel", "888.888.888-88");
    Produto produto3 = new Produto(3, "Mouse", "Dell");
    ItemVenda itemv3 = new ItemVenda(3, 300.00, 1, produto3);


    public Venda criar(Venda venda) {
        venda.setId(1);

        return venda;
    }

    public Venda atualizar(Venda venda, Integer id) {
        venda.setId(id);

        return venda;

    }

    public void deletar (Integer id) {

    }

    public List<Venda> listar() {

        List<ItemVenda> itemVendaLista = Arrays.asList(itemv1, itemv2, itemv3);

        Venda venda1 = new Venda(1, vendedor1, cliente1, itemVendaLista);
        venda1.setId(1);
        venda1.setVendedor(vendedor1);
        venda1.setCliente(cliente1);

        Venda venda2 = new Venda(2, vendedor2, cliente2, itemVendaLista);
        venda2.setId(2);
        venda2.setVendedor(vendedor2);
        venda2.setCliente(cliente2);


        Venda venda3 = new Venda(3, vendedor3, cliente3, itemVendaLista);
        venda3.setId(3);
        venda3.setVendedor(vendedor2);
        venda3.setCliente(cliente2);

        ItemVenda itemv1 = new ItemVenda(1, 200.00, 1, produto1);
        itemv1.setId(1);
        itemv1.setValor(200.00);
        itemv1.setQuantidade(1);
        itemv1.setProduto(produto1);

        ItemVenda itemv2 = new ItemVenda(2, 15000.00, 1, produto2);
        itemv2.setId(2);
        itemv2.setValor(15000.00);
        itemv2.setQuantidade(1);
        itemv2.setProduto(produto2);

        ItemVenda itemv3 = new ItemVenda(3, 300.00, 1, produto3);
        itemv3.setId(3);
        itemv3.setValor(300.00);
        itemv3.setQuantidade(1);
        itemv3.setProduto(produto3);

        List<Venda> vendaLista = Arrays.asList(venda1, venda2, venda3);

        return vendaLista;

    }


    public Venda obter (Integer id){

        List<ItemVenda> itemVendaLista = List.of(itemv1);
        System.out.println("Obterve id: " +id);

        Venda venda1 = new Venda(1,vendedor1, cliente1, itemVendaLista);
        venda1.setId(1);
        venda1.setVendedor(vendedor1);
        venda1.setCliente(cliente1);

        return venda1;

    }

}
