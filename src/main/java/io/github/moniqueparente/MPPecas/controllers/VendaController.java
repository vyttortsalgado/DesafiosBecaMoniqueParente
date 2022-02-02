package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.Venda;
import io.github.moniqueparente.MPPecas.dto.request.VendaDto;
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
    public ResponseEntity<VendaDto> criar(@RequestBody Venda venda){

        return ResponseEntity.created(null).body(vendaService.criar(venda));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<VendaDto> atualizar(@RequestBody VendaDto vendaDto,
                                              @PathVariable Integer id){

        return ResponseEntity.created(null)
                .body(new VendaDto(vendaService.atualizar(vendaDto,id)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Venda> deletar(@PathVariable Integer id) {
        vendaService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<VendaDto>> listar(){

        List<VendaDto> vendaLista = vendaService.listar();
        return ResponseEntity.ok(vendaLista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VendaDto> obter(@PathVariable Integer id){

        VendaDto vendaObtida = vendaService.obter(id);
        return ResponseEntity.ok(vendaObtida);
    }
}