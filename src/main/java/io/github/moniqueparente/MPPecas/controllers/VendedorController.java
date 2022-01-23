package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.Vendedor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {

    @PostMapping
    public Vendedor Criar(Vendedor vendedor){
        vendedor.setId(1);
        return vendedor;
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Vendedor> Atualizar(@RequestBody Vendedor vendedor, @PathVariable Integer id){
        vendedor.setId(id);
        System.out.println(vendedor);
        return ResponseEntity.ok(vendedor);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Vendedor> Deletar(@PathVariable Integer id) {

        return ResponseEntity.noContent().build();
    }

    @GetMapping()
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
    public ResponseEntity<Vendedor> Obter(@PathVariable Integer id){
        System.out.println("Obterve id: " +id);

        Vendedor vendedor1 = new Vendedor();
            vendedor1.setId(1);
            vendedor1.setNome("Eliezer");

        return  ResponseEntity.ok(vendedor1);

    }

    }





