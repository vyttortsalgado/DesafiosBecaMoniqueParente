package io.github.moniqueparente.MPPecas.dto.request;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.domains.Produto;

public class ItemVendaDto {
    private Double valor;
    private Integer quantidade;
    private String produtoNome;
    private String produtoMarca;

    public ItemVendaDto() {
    }

    public ItemVendaDto(Double valor, Integer quantidade, String produtoNome, String produtoMarca) {
        this.valor = valor;
        this.quantidade = quantidade;
        this.produtoNome = produtoNome;
        this.produtoMarca = produtoMarca;
    }

    public ItemVendaDto(ItemVenda itemVenda, Produto produto) {
        valor = itemVenda.getValor();
        quantidade = itemVenda.getQuantidade();
        produtoNome = produto.getNome();
        produtoMarca = produto.getMarca();
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public String getProdutoMarca() {
        return produtoMarca;
    }

    public void setProdutoMarca(String produtoMarca) {
        this.produtoMarca = produtoMarca;
    }
}