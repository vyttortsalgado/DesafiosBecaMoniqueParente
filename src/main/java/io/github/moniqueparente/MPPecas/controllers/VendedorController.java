package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.Vendedor;

import io.github.moniqueparente.MPPecas.services.VendedorService;
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

    @PostMapping
    public ResponseEntity<Vendedor> criar (@RequestBody Vendedor vendedor){
        vendedor.setId(1);

        System.out.println(vendedor);
        return ResponseEntity.created(null).body(vendedor);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Vendedor> atualizar (@RequestBody Vendedor vendedor, @PathVariable Integer id){
        vendedor.setId(id);
        System.out.println(vendedor);
        return ResponseEntity.ok(vendedor);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Vendedor> deletar (@PathVariable Integer id) {


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

    public ResponseEntity<List<Vendedor>> Listar() {

        Vendedor vendedor1 = new Vendedor();
            vendedor1.setId(1);
            vendedor1.setNome("Eliezer");

        Vendedor vendedor2 = new Vendedor();
            vendedor2.setId(2);
            vendedor2.setNome("Giovane");

        Vendedor vendedor3 = new Vendedor();
            vendedor3.setId(3);
            vendedor3.setNome("Yuna");

        return ResponseEntity.ok(List.of(vendedor1, vendedor2, vendedor3));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vendedor> obter (@PathVariable Integer id){
        System.out.println("Obterve id: " +id);

        Vendedor vendedor1 = new Vendedor();
            vendedor1.setId(1);
            vendedor1.setNome("Eliezer");

        return  ResponseEntity.ok(vendedor1);

    }

    }
