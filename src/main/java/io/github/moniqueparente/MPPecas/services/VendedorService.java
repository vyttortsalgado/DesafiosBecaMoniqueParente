package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.Vendedor;
import io.github.moniqueparente.MPPecas.repositorio.MPPecasInterface;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VendedorService implements MPPecasInterface<Vendedor> {


    public Vendedor criar (Vendedor vendedor){
        vendedor.setId(1);

        return vendedor;
    }

    public Vendedor atualizar (Vendedor vendedor, Integer id){


        return vendedor;
    }


    public void deletar (Integer id) {

    }


    public List<Vendedor> listar() {

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setId(1);
        vendedor1.setNome("Eliezer");

        Vendedor vendedor2 = new Vendedor();
        vendedor2.setId(2);
        vendedor2.setNome("Giovane");

        Vendedor vendedor3 = new Vendedor();
        vendedor3.setId(3);
        vendedor3.setNome("Yuna");

        List<Vendedor> listaVendedor = Arrays.asList(vendedor1,vendedor2,vendedor3);

        return  listaVendedor;

    }


    public Vendedor obter (Integer id){
        System.out.println("Obterve id: " +id);

        Vendedor vendedor1 = new Vendedor(1,"Eliezer");
        vendedor1.setId(1);
        vendedor1.setNome("Eliezer");

        return  vendedor1;

    }
}
