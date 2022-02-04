package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import io.github.moniqueparente.MPPecas.dto.request.ClienteDto;
import io.github.moniqueparente.MPPecas.mappers.ClienteMapper;
import io.github.moniqueparente.MPPecas.repository.ClienteRepository;
import io.github.moniqueparente.MPPecas.services.ClienteServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Service
public class ClienteService implements ClienteServiceInterface {

    @Autowired
    private ClienteRepository clienteRepositorio;

    @Autowired
    private ClienteMapper clienteMapper;

    public ClienteDto criar(ClienteDto clienteDto) {

        Cliente clientealvo = clienteRepositorio.save(clienteMapper.cliente(clienteDto));
        return clienteMapper.clienteDto(clientealvo);
    }

    public ClienteDto atualizar (ClienteDto clienteDto, Integer id){

        return clienteMapper.clienteDto(clienteRepositorio.findById(id)
                .map(clienteObtidoId -> clienteRepositorio.save(clienteMapper.cliente(clienteDto)))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
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
