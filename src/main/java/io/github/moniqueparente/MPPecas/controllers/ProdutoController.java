package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @PostMapping
    public ResponseEntity<Produto> criar
            (@RequestBody Produto produto){
        produto.setId(1);

        System.out.println(produto);
        return ResponseEntity.created(null).body(produto);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Produto> Atualizar(@RequestBody Produto produto, @PathVariable Integer id){
        produto.setId(id);
        System.out.println(produto);
        return ResponseEntity.ok(produto);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Produto> Deletar(@PathVariable Integer id) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<Produto>> Listar() {

        Produto produto1 = new Produto();
            produto1.setId(1);
            produto1.setNome("Teclado");
            produto1.setMarca("Redragon");

        Produto produto2 = new Produto();
            produto2.setId(2);
            produto2.setNome("Notebook");
            produto2.setMarca("Alienware");

        Produto produto3 = new Produto();
            produto3.setId(3);
            produto3.setNome("Mouse");
            produto3.setMarca("Dell");

        return ResponseEntity.ok(List.of(produto1, produto2, produto3));
    }

        @GetMapping("/{id}")
        public ResponseEntity<Produto> Obter(@PathVariable Integer id){
            System.out.println("Obterve id: " +id);

            Produto produto1 = new Produto();
                produto1.setId(1);
                produto1.setNome("Teclado");
                produto1.setMarca("Redragon");

            return  ResponseEntity.ok(produto1);

        }

    }

