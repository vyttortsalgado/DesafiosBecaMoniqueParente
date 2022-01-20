package io.github.moniqueparente.MPPecas.entidades;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Carrinho implements Serializable {
    private static final Integer serialVersionUID = 1;

    private Integer idCarrinho;
    private Double totalCarrinho;
    private Venda venda;

    public List<Venda> listaVendas;

    public Carrinho(Integer idCarrinho, Double totalCarrinho, List<Venda> listaVendas, Venda venda) {
        this.idCarrinho = idCarrinho;
        this.totalCarrinho = totalCarrinho;
        this.listaVendas = listaVendas;
        this.venda = venda;
    }

    public Integer getIdCarrinho() {

        return idCarrinho;
    }

    public void setIdCarrinho(Integer idCarrinho) {

        this.idCarrinho = idCarrinho;
    }

    public Double getTotalCarrinho() {

        return totalCarrinho;
    }

    public void setTotalCarrinho(Double totalCarrinho) {

        this.totalCarrinho = totalCarrinho;
    }

    public List<Venda> getListaVendas() {

        return listaVendas;
    }

    public void setListaVendas(List<Venda> listaVendas) {

        this.listaVendas = listaVendas;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carrinho carrinho = (Carrinho) o;
        return Objects.equals(idCarrinho, carrinho.idCarrinho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCarrinho);
    }
}
