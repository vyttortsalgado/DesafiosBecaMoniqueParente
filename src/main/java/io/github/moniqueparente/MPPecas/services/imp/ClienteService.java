package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import io.github.moniqueparente.MPPecas.dto.request.ClienteDtoRequest;
import io.github.moniqueparente.MPPecas.dto.response.ClienteDtoResponse;
import io.github.moniqueparente.MPPecas.mappers.MapperClienteAtualizar;
import io.github.moniqueparente.MPPecas.mappers.MapperClienteRequestToCliente;
import io.github.moniqueparente.MPPecas.mappers.MapperClienteToClienteResponse;
import io.github.moniqueparente.MPPecas.repository.ClienteRepository;
import io.github.moniqueparente.MPPecas.services.ClienteServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Service
public class ClienteService implements ClienteServiceInterface {

    private final ClienteRepository clienteRepository;
    private final MapperClienteRequestToCliente mapperClienteRequestToCliente;
    private final MapperClienteToClienteResponse mapperClienteToClienteResponse;
    private final MapperClienteAtualizar mapperClienteAtualizar;


    public ClienteDtoResponse criar(@RequestBody @Valid ClienteDtoRequest clienteDtoRequest) {

        Cliente cliente = mapperClienteRequestToCliente.toModel(clienteDtoRequest);

        clienteRepository.save(cliente);

        ClienteDtoResponse clienteDtoResponse = mapperClienteToClienteResponse.toResponse(cliente);

        return clienteDtoResponse;

    }

    public ClienteDtoResponse atualizar (@RequestBody @Valid ClienteDtoRequest clienteDtoResquest, Integer id){

        Cliente clienteObtido = clienteRepository.findById(id).get();

        mapperClienteAtualizar.atualizar(clienteDtoResquest, clienteObtido);

        clienteRepository.save(clienteObtido);

        return mapperClienteToClienteResponse.toResponse(clienteObtido);
    }

    public void deletar (Integer id){
        clienteRepository.deleteById(id);
    }

    public List<ClienteDtoResponse> listar() {

        List<Cliente> listaCliente = clienteRepository.findAll();

        return listaCliente
                .stream()
                .map(mapperClienteToClienteResponse::toResponse)
                .collect(Collectors.toList());
    }

    public ClienteDtoResponse obter (Integer id) {
        Cliente cliente = clienteRepository.findById(id).get();

        return mapperClienteToClienteResponse.toResponse(cliente);
    }
}
