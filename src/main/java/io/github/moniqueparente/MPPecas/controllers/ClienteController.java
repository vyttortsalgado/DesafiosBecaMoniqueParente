package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import io.github.moniqueparente.MPPecas.dto.request.ClienteDto;
import io.github.moniqueparente.MPPecas.dto.response.ClienteDto;
import io.github.moniqueparente.MPPecas.services.imp.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Object> criar(@RequestBody ClienteDto clienteDtoRequest){
        ClienteDto cliente = clienteService.criar(clienteDtoRequest.build());

        return ResponseEntity.created(null).body(cliente);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@RequestBody Cliente cliente, @PathVariable Integer id){
        Cliente clienteAtualizado = clienteService.atualizar(cliente,id);

        return ResponseEntity.ok(clienteAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> deletar(@PathVariable Integer id) {
        clienteService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<ClienteDto>> listar(){
        List<Cliente> clienteListado = clienteService.listar();

        return new ClienteDto(<clienteService> clienteListado);
    }

    @GetMapping("/{id}")
    public ClienteDto obter(@PathVariable Integer id) {
        Cliente clienteObtido = clienteService.obter(id);

        return new ClienteDto(clienteObtido);

    }
}