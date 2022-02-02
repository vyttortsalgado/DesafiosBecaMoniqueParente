package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.Venda;
import io.github.moniqueparente.MPPecas.services.imp.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping
    public ResponseEntity<Venda> criar(@RequestBody Venda venda){
        Venda vendaCriada = vendaService.criar(venda);

        return ResponseEntity.created(null).body(vendaCriada);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Venda> atualizar(@RequestBody Venda venda, @PathVariable Integer id){
        Venda vendaAtualizada = vendaService.atualizar(venda,id);

        return ResponseEntity.ok(vendaAtualizada);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Venda> deletar(@PathVariable Integer id) {
        vendaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Venda>> listar(){

        List<Venda> vendaListada = vendaService.listar();

        return ResponseEntity.ok(vendaListada);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Venda> obter(@PathVariable Integer id){
        Venda vendaObtida = vendaService.obter(id);

        return  ResponseEntity.ok(vendaObtida);

    }
}