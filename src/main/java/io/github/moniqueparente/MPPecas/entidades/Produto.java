package io.github.moniqueparente.MPPecas.entidades;

import java.util.Objects;

public class Produto {

    private Integer idProduto;
    private String nomeProduto;
    private String marcaProduto;
    private Double valorProduto;
    private Boolean statusProduto;
    private Estoque estoque;

    public Produto(Integer idProduto, String nomeProduto, String marcaProduto,
                   Double valorProduto, Boolean statusProduto, Estoque estoque) {

        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.marcaProduto = marcaProduto;
        this.valorProduto = valorProduto;
        this.statusProduto = statusProduto;
        this.estoque = estoque;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Boolean getStatusProduto() {
        return statusProduto;
    }

    public void setStatusProduto(Boolean statusProduto) {
        this.statusProduto = statusProduto;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(idProduto, produto.idProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduto);
    }
}


