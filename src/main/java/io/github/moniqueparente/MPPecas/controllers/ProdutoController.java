package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.dto.request.ProdutoDtoRequest;
import io.github.moniqueparente.MPPecas.dto.response.ProdutoDtoResponse;
import io.github.moniqueparente.MPPecas.services.imp.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoDtoResponse> criar(@RequestBody @Valid ProdutoDtoRequest produtoDtoRequest){

        return ResponseEntity.created(null).body(produtoService.criar(produtoDtoRequest));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProdutoDtoResponse> atualizar(@RequestBody ProdutoDtoRequest produtoDtoRequest,
                                                @PathVariable Integer id){

        return ResponseEntity.ok(produtoService.atualizar(produtoDtoRequest,id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProdutoDtoResponse> deletar(@PathVariable Integer id) {

        produtoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<ProdutoDtoResponse>> Listar(){

        List<ProdutoDtoResponse> produtoLista = produtoService.listar();
        return ResponseEntity.ok(produtoLista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDtoResponse> obter(@PathVariable Integer id){

        ProdutoDtoResponse produtoObtido = produtoService.obter(id);
        return ResponseEntity.ok(produtoObtido);
    }

}