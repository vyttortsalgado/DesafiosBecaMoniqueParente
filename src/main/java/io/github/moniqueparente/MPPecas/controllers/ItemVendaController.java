package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.dto.request.ItemVendaDto;
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
    public ResponseEntity<ItemVendaDto> criar(@RequestBody ItemVenda itemVenda){

        return ResponseEntity.created(null).body(itemVendaService.criar(itemVenda));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ItemVendaDto> atualizar(@RequestBody ItemVendaDto itemVendaDto,
                                                  @PathVariable Integer id){

        return ResponseEntity.created(null)
                .body(new ItemVendaDto(itemVendaService.atualizar(itemVendaDto,id)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ItemVenda> deletar(@PathVariable Integer id) {
        itemVendaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ItemVendaDto>> Lista(){

        List<ItemVendaDto> itemVendaLista = itemVendaService.listar();
        return ResponseEntity.ok(itemVendaLista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemVendaDto> obter(@PathVariable Integer id) {

        ItemVendaDto itemVendaObtido = itemVendaService.obter(id);
        return ResponseEntity.ok(itemVendaObtido);
    }

}