package io.github.moniqueparente.MPPecas.domains;

import lombok.Builder;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Builder
@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "vendedor_id", nullable = false)
    private Vendedor vendedor;

    @OneToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @OneToMany
    private List<ItemVenda> itemVendaLista;

    public Venda() {
    }

    public Venda(Integer id, Vendedor vendedor, Cliente cliente, List<ItemVenda> itemVendaLista) {
        this.id = id;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.itemVendaLista = itemVendaLista;
    }

    double valorTotal(){

        double precototal = 0;
        for(ItemVenda itemVenda : this.itemVendaLista){
            precototal += itemVenda.getValor();

        } return  precototal;
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

    public List<ItemVenda> getItemVendaLista() {
        return itemVendaLista;
    }

    public void setItemVendaLista(List<ItemVenda> itemVendaLista) {
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
                ", itemVendaLista=" + itemVendaLista +
                '}';
    }
}
