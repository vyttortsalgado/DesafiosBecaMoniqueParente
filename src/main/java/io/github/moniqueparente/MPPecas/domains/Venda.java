package io.github.moniqueparente.MPPecas.domains;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Vendedor vendedor;

    @OneToOne
    private Cliente cliente;

    @OneToMany
    List<ItemVenda> itemVendaLista = new ArrayList<>();

    public Venda(Integer id, Vendedor vendedor, Cliente cliente, List<ItemVenda> itemVendaLista) {
        this.id = id;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.itemVendaLista = itemVendaLista;
    }

    public Integer getId() {
        return id;
    }

    public Integer setId(Integer id) {
        return this.id = id;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItemVendaList() {
        return itemVendaLista;
    }

    public void setItemVendaList(List<ItemVenda> itemVendaLista) {

        this.itemVendaLista = itemVendaLista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return id.equals(venda.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", vendedor=" + vendedor +
                ", cliente=" + cliente +
                ", itemVendaList=" + itemVendaLista +
                '}';
    }
}
