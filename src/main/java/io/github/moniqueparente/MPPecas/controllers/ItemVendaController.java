package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.services.imp.ItemVendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itemvenda")
public class ItemVendaController {

    @Autowired
    private ItemVendaService itemVendaService;

    @PostMapping
    public ResponseEntity<ItemVenda> criar(@RequestBody ItemVenda itemVenda){
        ItemVenda itemVendaCriado = itemVendaService.criar(itemVenda);

        return ResponseEntity.created(null).body(itemVendaCriado);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ItemVenda> atualizar(@RequestBody ItemVenda itemVenda, @PathVariable Integer id){
        ItemVenda itemVendaAtualizado = itemVendaService.atualizar(itemVenda,id);

        return ResponseEntity.ok(itemVendaAtualizado);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ItemVenda> deletar(@PathVariable Integer id) {
        itemVendaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ItemVenda>> Lista(){
        List<ItemVenda> itemVendaListada = itemVendaService.listar();

        return ResponseEntity.ok(itemVendaListada);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemVenda> obter(@PathVariable Integer id) {
        ItemVenda itemVendaObtida = itemVendaService.obter(id);

        return ResponseEntity.ok(itemVendaObtida);

    }

}