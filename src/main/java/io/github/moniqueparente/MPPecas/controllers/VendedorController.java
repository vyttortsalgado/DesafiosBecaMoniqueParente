package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.Vendedor;
import io.github.moniqueparente.MPPecas.dto.request.VendedorDto;
import io.github.moniqueparente.MPPecas.services.imp.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    @PostMapping
    public ResponseEntity<VendedorDto> criar(@RequestBody Vendedor vendedor){

        return ResponseEntity.created(null).body(vendedorService.criar(vendedor));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<VendedorDto> atualizar(@RequestBody VendedorDto vendedorDto,
                                                 @PathVariable Integer id){

        return ResponseEntity.created(null)
                .body(new VendedorDto(vendedorService.atualizar(vendedorDto,id)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Vendedor> deletar(@PathVariable Integer id) {

        vendedorService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<VendedorDto>> listar(){

        List<VendedorDto> vendedorLista = vendedorService.listar();
        return ResponseEntity.ok(vendedorLista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VendedorDto> obter(@PathVariable Integer id){

        VendedorDto vendedorObtido = vendedorService.obter(id);
        return ResponseEntity.ok(vendedorObtido);
    }

}