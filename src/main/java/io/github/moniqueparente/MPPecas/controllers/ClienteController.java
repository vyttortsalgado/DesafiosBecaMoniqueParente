package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import io.github.moniqueparente.MPPecas.services.ClienteService;
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
    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente) {
        Cliente clienteCriado = clienteService.criar(cliente);

        return ResponseEntity.created(null).body(clienteCriado);
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
    public ResponseEntity<List<Cliente>> listar(){
        List<Cliente> clienteListado = clienteService.listar();

        return ResponseEntity.ok(clienteListado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> obter(@PathVariable Integer id) {
        Cliente clienteObtido = clienteService.obter(id);

        return ResponseEntity.ok(clienteObtido);

    }
}