package io.github.moniqueparente.MPPecas.domains;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Venda {

    private Integer id;
    private Vendedor vendedor;
    private Cliente cliente;

    List<ItemVenda> itemVendaLista = new ArrayList<>();


    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", vendedor=" + vendedor +
                ", cliente=" + cliente +
                ", itemVendaList=" + itemVendaLista +
                '}';
    }

    public Venda(Integer id, Vendedor vendedor, Cliente cliente, List<ItemVenda> itemVendaLista) {
        this.id = id;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.itemVendaLista = itemVendaLista;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
