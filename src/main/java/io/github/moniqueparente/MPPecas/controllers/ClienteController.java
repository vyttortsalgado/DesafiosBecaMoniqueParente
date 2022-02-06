package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.dto.request.ClienteDtoRequest;
import io.github.moniqueparente.MPPecas.dto.response.ClienteDtoResponse;
import io.github.moniqueparente.MPPecas.services.imp.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteDtoResponse> criar(@RequestBody @Valid ClienteDtoRequest clienteDtoRequest){

        return ResponseEntity.created(null).body(clienteService.criar(clienteDtoRequest));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ClienteDtoResponse> atualizar(@RequestBody ClienteDtoRequest clienteDtoRequest,
                                             @PathVariable Integer id){
        return ResponseEntity.ok(clienteService.atualizar(clienteDtoRequest,id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ClienteDtoResponse> deletar(@PathVariable Integer id) {

        clienteService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<ClienteDtoResponse>> listar(){

        List<ClienteDtoResponse> clienteLista = clienteService.listar();
        return ResponseEntity.ok(clienteLista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDtoResponse> obter(@PathVariable Integer id) {

        ClienteDtoResponse clienteObtido = clienteService.obter(id);
        return ResponseEntity.ok(clienteObtido);
    }
}