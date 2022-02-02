package io.github.moniqueparente.MPPecas.dto.request;

import io.github.moniqueparente.MPPecas.domains.Vendedor;

public class VendedorDto {
    private String nome;

    public VendedorDto() {
    }

    public VendedorDto(String nome) {
        this.nome = nome;
    }

    public VendedorDto(Vendedor vendedor) {
        nome = vendedor.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

