package io.github.moniqueparente.MPPecas.controllers;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @PostMapping
    public ResponseEntity<Cliente> criar (@RequestBody Cliente cliente) {
        cliente.setId(1);

        System.out.println(cliente);
        return ResponseEntity.created(null).body(cliente);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Cliente> atualizar (@RequestBody Cliente cliente, @PathVariable Integer id){
        cliente.setId(id);
        System.out.println(cliente);
        return ResponseEntity.ok(cliente);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Cliente> deletar (@PathVariable Integer id) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping()
    public ResponseEntity<List<Cliente>> Listar() {

        Cliente cliente1 = new Cliente();
            cliente1.setId(1);
            cliente1.setNome("Monique");
            cliente1.setCpf("777.777.777-77");

        Cliente cliente2 = new Cliente();
            cliente2.setId(2);
            cliente2.setNome("Laura");
            cliente2.setCpf("999.999.999-99");

        Cliente cliente3 = new Cliente();
            cliente3.setId(3);
            cliente3.setNome("Daniel");
            cliente3.setCpf("888.888.888-88");

        return ResponseEntity.ok(List.of(cliente1, cliente2, cliente3));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> obter (@PathVariable Integer id) {
        System.out.println("Obterve id: " + id);

        Cliente cliente1 = new Cliente();
            cliente1.setId(1);
            cliente1.setNome("Monique");
            cliente1.setCpf("777.777.777-77");

        return ResponseEntity.ok(cliente1);

    }
}

