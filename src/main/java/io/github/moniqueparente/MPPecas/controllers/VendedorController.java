package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.Vendedor;
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
    public ResponseEntity<Vendedor> criar(@RequestBody Vendedor vendedor){
        Vendedor vendedorCriado = vendedorService.criar(vendedor);

        return ResponseEntity.created(null).body(vendedorCriado);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Vendedor> atualizar(@RequestBody Vendedor vendedor, @PathVariable Integer id){
        Vendedor vendedorAtualizado = vendedorService.atualizar(vendedor,id);

        return ResponseEntity.ok(vendedorAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Vendedor> deletar(@PathVariable Integer id) {
        vendedorService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<Vendedor>> listar(){
        List<Vendedor> vendedorListado = vendedorService.listar();


        return ResponseEntity.ok(vendedorListado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vendedor> obter(@PathVariable Integer id){
        Vendedor vendedorObtido = vendedorService.obter(id);

        return  ResponseEntity.ok(vendedorObtido);

    }

}