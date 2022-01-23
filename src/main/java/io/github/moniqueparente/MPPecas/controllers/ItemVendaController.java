package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.domains.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itemvenda")
public class ItemVendaController {

    Produto produto1 = new Produto(1,"Teclado","Redragon");
    Produto produto2 = new Produto(2,"Notebook", "Alienware");
    Produto produto3 = new Produto(3,"Mouse", "Dell");

    @PostMapping
    public ResponseEntity<ItemVenda> criar
            (@RequestBody ItemVenda itemVenda){
        itemVenda.setId(1);

        System.out.println(itemVenda);
        return ResponseEntity.created(null).body(itemVenda);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ItemVenda> Atualizar(@RequestBody ItemVenda itemVenda, @PathVariable Integer id){
        itemVenda.setId(id);
        System.out.println(itemVenda);
        return ResponseEntity.ok(itemVenda);

    }

    @DeleteMapping
    public ResponseEntity<ItemVenda> Deletar(@PathVariable Integer id) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ItemVenda>> Lista (){

        ItemVenda itemv1 = new ItemVenda(1,200.00,1,produto1);
            itemv1.setId(1);
            itemv1.setValor(200.00);
            itemv1.setQuantidade(1);
            itemv1.setProduto(produto1);

        ItemVenda itemv2 = new ItemVenda(2,15000.00,1,produto2);
            itemv2.setId(2);
            itemv2.setValor(15000.00);
            itemv2.setQuantidade(1);
            itemv2.setProduto(produto2);

        ItemVenda itemv3 = new ItemVenda(3,300.00,1,produto3);
            itemv3.setId(3);
            itemv3.setValor(300.00);
            itemv3.setQuantidade(1);
            itemv3.setProduto(produto3);

     return ResponseEntity.ok(List.of(itemv1, itemv2, itemv3));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemVenda> Obter(@PathVariable Integer id) {
        System.out.println("Obterve id: " + id);

        ItemVenda itemv1 = new ItemVenda(1,200.00,1,produto1);
            itemv1.setId(1);
            itemv1.setValor(200.00);
            itemv1.setQuantidade(1);
            itemv1.setProduto(produto1);

        return ResponseEntity.ok(itemv1);

    }

}
