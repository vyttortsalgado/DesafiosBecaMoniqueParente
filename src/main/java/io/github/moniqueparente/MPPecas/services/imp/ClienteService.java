package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import io.github.moniqueparente.MPPecas.dto.request.ClienteDto;
import io.github.moniqueparente.MPPecas.repository.ClienteRepository;
import io.github.moniqueparente.MPPecas.services.ClienteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService implements ClienteServiceInterface {

    @Autowired
    private ClienteRepository clienteRepositorio;

    public ClienteDto criar(Cliente cliente) {

        Cliente clientesalvo = clienteRepositorio.save(cliente);

        return new ClienteDto(cliente);
    }

    public Cliente atualizar (ClienteDto clienteDto, Integer id){

        return clienteRepositorio.findById(id)
                .map(cliente -> {
                    cliente.setNome(clienteDto.getNome());
                    cliente.setCpf(clienteDto.getCpf());
                    return clienteRepositorio.save(cliente);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public void deletar (Integer id){
        clienteRepositorio.deleteById(id);
    }

    public List<ClienteDto> listar() {

        List<ClienteDto> listaClienteDto = new ArrayList<>();

        clienteRepositorio.findAll().stream()
                .forEach(cliente -> listaClienteDto.add(new ClienteDto(cliente)));

        return listaClienteDto;
    }

    public ClienteDto obter (Integer id) {

        return new ClienteDto(clienteRepositorio.findById(id).get());
    }
}
