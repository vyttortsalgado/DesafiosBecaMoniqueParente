package io.github.moniqueparente.MPPecas.dto.request;

import io.github.moniqueparente.MPPecas.domains.Cliente;

public class ClienteDto {
    private String nome;

    public ClienteDto() {
    }

    public ClienteDto(String nome) {
        this.nome = nome;
    }

    public ClienteDto(Cliente cliente) {
        nome = cliente.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
