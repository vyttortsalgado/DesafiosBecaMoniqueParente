package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.Vendedor;
import io.github.moniqueparente.MPPecas.dto.request.VendedorDtoRequest;
import io.github.moniqueparente.MPPecas.dto.response.VendedorDtoResponse;
import io.github.moniqueparente.MPPecas.services.imp.VendedorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/vendedor")
public class VendedorController {

    @Autowired
    private VendedorService vendedorService;

    @PostMapping
    public ResponseEntity<VendedorDtoResponse> criar(@RequestBody @Valid VendedorDtoRequest vendedorDtoRequest){

        return ResponseEntity.created(null).body(vendedorService.criar(vendedorDtoRequest));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<VendedorDtoResponse> atualizar(@RequestBody @Valid VendedorDtoRequest vendedorDtoRequest,
                                                         @PathVariable Integer id){

        return ResponseEntity.ok(vendedorService.atualizar(vendedorDtoRequest,id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Vendedor> deletar(@PathVariable Integer id) {

        vendedorService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<VendedorDtoResponse>> listar(){

        List<VendedorDtoResponse> vendedorLista = vendedorService.listar();
        return ResponseEntity.ok(vendedorLista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<VendedorDtoResponse> obter(@PathVariable Integer id){

        VendedorDtoResponse vendedorObtido = vendedorService.obter(id);
        return ResponseEntity.ok(vendedorObtido);
    }
}