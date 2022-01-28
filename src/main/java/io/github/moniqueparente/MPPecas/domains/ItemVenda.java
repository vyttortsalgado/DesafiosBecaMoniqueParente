package io.github.moniqueparente.MPPecas.domains;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double valor;
    private Integer quantidade;

    @OneToOne
    private Produto produto;

    @ManyToOne
    private Venda venda;

    public ItemVenda(Integer id, Double valor, Integer quantidade, Produto produto) {
        this.id = id;
        this.valor = valor;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemVenda itemVenda = (ItemVenda) o;
        return id.equals(itemVenda.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "id=" + id +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                ", produto=" + produto +
                '}';
    }
}
