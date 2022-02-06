package io.github.moniqueparente.MPPecas.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
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
    @ToString.Exclude
    private List<ItemVenda> itemVendaLista;

    double valorTotal(){

        double precototal = 0;
        for(ItemVenda itemVenda : this.itemVendaLista){
            precototal += itemVenda.getValor();

        } return  precototal;
    }
}
