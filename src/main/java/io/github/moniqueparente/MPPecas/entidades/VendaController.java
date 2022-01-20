package io.github.moniqueparente.MPPecas.entidades;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/venda")
public class VendaController {

    @GetMapping
    public ResponseEntity<List<Venda>> findAll() {
        List<Venda> list = new ArrayList<>();
		//.....just testing
        return ResponseEntity.ok().body(list);
    }
}

