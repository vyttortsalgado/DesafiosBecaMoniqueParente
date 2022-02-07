package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.dto.request.ItemVendaDtoRequest;
import io.github.moniqueparente.MPPecas.dto.response.ItemVendaDtoResponse;
import io.github.moniqueparente.MPPecas.services.imp.ItemVendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/itemvenda")
public class ItemVendaController {

    @Autowired
    private ItemVendaService itemVendaService;

    @PostMapping
    public ResponseEntity<ItemVendaDtoResponse> criar(@RequestBody @Valid
                                                ItemVendaDtoRequest itemVendaDtoRequest){

        return ResponseEntity.created(null).body(itemVendaService.criar(itemVendaDtoRequest));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ItemVendaDtoResponse> atualizar(@RequestBody ItemVendaDtoRequest itemVendaDtoRequest,
                                                          @PathVariable Integer id){

        return ResponseEntity.ok(itemVendaService.atualizar(itemVendaDtoRequest,id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ItemVenda> deletar(@PathVariable Integer id) {
        itemVendaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ItemVendaDtoResponse>> Lista(){

        List<ItemVendaDtoResponse> itemVendaLista = itemVendaService.listar();
        return ResponseEntity.ok(itemVendaLista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemVendaDtoResponse> obter(@PathVariable Integer id) {

        ItemVendaDtoResponse itemVendaObtido = itemVendaService.obter(id);
        return ResponseEntity.ok(itemVendaObtido);
    }

}