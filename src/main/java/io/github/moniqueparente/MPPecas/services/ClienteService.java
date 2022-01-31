package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import io.github.moniqueparente.MPPecas.repositorio.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepositorio;

    public Cliente criar(Cliente cliente) {
        Cliente clienteSalvo = clienteRepositorio.save(cliente);

        return clienteSalvo;
    }

    public Cliente atualizar (Cliente cliente, Integer id){
        Cliente clienteObtido = this.obter(id);
        clienteObtido.setNome(cliente.getNome());
        clienteObtido.setCpf(cliente.getCpf());

        clienteRepositorio.save(clienteObtido);

        return cliente;
    }

    public void deletar (Integer id){
        clienteRepositorio.deleteById(id);
    }

    public List<Cliente> listar() {

        List<Cliente> listaCliente = clienteRepositorio.findAll();

        return listaCliente;
    }

    public Cliente obter (Integer id) {
        Cliente cliente = clienteRepositorio.findById(id).get();

        return cliente;

    }
}
