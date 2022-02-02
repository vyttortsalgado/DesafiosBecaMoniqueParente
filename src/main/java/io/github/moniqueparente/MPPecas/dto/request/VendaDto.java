package io.github.moniqueparente.MPPecas.dto.request;

import io.github.moniqueparente.MPPecas.domains.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendaDto {
    private Vendedor vendedor;
    private Cliente cliente;
    private List<ItemVenda> itemVendaLista;

    public VendaDto(Venda venda) {
        this.vendedor = venda.getVendedor();
        this.cliente = venda.getCliente();
        this.itemVendaLista = venda.getItemVendaLista();
    }


}
