package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ClienteService{

    public Cliente criar(Cliente cliente) {
        cliente.setId(1);

        return cliente;
    }

    public Cliente atualizar (Cliente cliente, Integer id){
        cliente.getId(id);

        return cliente;
    }

    public void deletar (Integer id){

    }

    public List<Cliente> listar() {

        Cliente cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Monique");
        cliente1.setCpf("777.777.777-77");

        Cliente cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNome("Laura");
        cliente2.setCpf("999.999.999-99");

        Cliente cliente3 = new Cliente();
        cliente3.setId(3);
        cliente3.setNome("Daniel");
        cliente3.setCpf("888.888.888-88");

        List<Cliente> listaCliente = Arrays.asList(cliente1,cliente2,cliente3);

        return listaCliente;
    }

    public Cliente obter (Integer id) {
        System.out.println("Obterve id: " +id);

        Cliente cliente1 = new Cliente(1,"Monique","777.777.777-77");
        cliente1.setId(1);
        cliente1.setNome("Monique");
        cliente1.setCpf("777.777.777-77");

        return cliente1;

    }
}
