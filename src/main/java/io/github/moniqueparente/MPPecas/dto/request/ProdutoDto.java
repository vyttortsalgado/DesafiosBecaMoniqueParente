package io.github.moniqueparente.MPPecas.dto.request;

import io.github.moniqueparente.MPPecas.domains.Produto;

import java.util.List;

public class ProdutoDto {
    private String nome;
    private String marca;

    public ProdutoDto(List<Produto> listaProduto) {
    }

    public ProdutoDto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public ProdutoDto(Produto produto) {
        nome = produto.getNome();
        marca = produto.getMarca();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}


