package io.github.moniqueparente.MPPecas.entidades;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/estoque")
public class EstoqueController {

    @GetMapping
    public ResponseEntity<List<Estoque>> findAll() {
        List<Estoque> list = new ArrayList<>();
        //.....just testing
        return ResponseEntity.ok().body(list);
    }
}

