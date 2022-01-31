package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.Produto;
import io.github.moniqueparente.MPPecas.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> criar(@RequestBody Produto produto){
        Produto produtoCriado = produtoService.criar(produto);

        return ResponseEntity.created(null).body(produtoCriado);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@RequestBody Produto produto, @PathVariable Integer id){
        Produto produtoAtualizado = produtoService.atualizar(produto,id);

        return ResponseEntity.ok(produtoAtualizado);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Produto> deletar(@PathVariable Integer id) {
        produtoService.deletar(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<Produto>> Listar(){
        List<Produto> produtoListado = produtoService.listar();


        return ResponseEntity.ok(produtoListado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> obter(@PathVariable Integer id){
        Produto produtoObtido = produtoService.obter(id);

        return  ResponseEntity.ok(produtoObtido);

    }

}