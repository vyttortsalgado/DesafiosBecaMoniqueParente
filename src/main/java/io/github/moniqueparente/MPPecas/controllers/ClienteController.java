package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.dto.request.ClienteDto;
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
    public ResponseEntity<ClienteDto> criar(@RequestBody @Valid ClienteDto clienteDto){

        return ResponseEntity.created(null).body(clienteService.criar(clienteDto));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ClienteDto> atualizar(@RequestBody ClienteDto clienteDto,
                                             @PathVariable Integer id){
        return ResponseEntity.created(null)
                .body(clienteService.atualizar(clienteDto,id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ClienteDto> deletar(@PathVariable Integer id) {

        clienteService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<ClienteDto>> listar(){

        List<ClienteDto> clienteLista = clienteService.listar();
        return ResponseEntity.ok(clienteLista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDto> obter(@PathVariable Integer id) {

        ClienteDto clienteObtido = clienteService.obter(id);
        return ResponseEntity.ok(clienteObtido);
    }
}