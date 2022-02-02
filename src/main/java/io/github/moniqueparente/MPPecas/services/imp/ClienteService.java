package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import io.github.moniqueparente.MPPecas.dto.request.ClienteDto;
import io.github.moniqueparente.MPPecas.repositorio.ClienteRepository;
import io.github.moniqueparente.MPPecas.services.ClienteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements ClienteServiceInterface {

    @Autowired
    private ClienteRepository clienteRepositorio;

    public ClienteDto criar(Cliente cliente) {
        Cliente clienteSalvo = clienteRepositorio.save(cliente);

        return new ClienteDto(clienteSalvo);
    }

    public ClienteDto atualizar (Cliente cliente){
        Cliente clienteObtido = new Cliente();
        clienteObtido.setNome(cliente.getNome());
        clienteObtido.setCpf(cliente.getCpf());

        clienteRepositorio.save(clienteObtido);

        return new ClienteDto(clienteObtido);
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
