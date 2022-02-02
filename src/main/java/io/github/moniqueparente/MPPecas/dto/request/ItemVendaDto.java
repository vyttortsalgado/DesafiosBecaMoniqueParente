package io.github.moniqueparente.MPPecas.dto.request;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.domains.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemVendaDto {
    private Double valor;
    private Integer quantidade;
    private Produto produto;

    public ItemVendaDto(ItemVenda itemVenda) {
        this.valor = itemVenda.getValor();
        this.quantidade = itemVenda.getQuantidade();
        this.produto = itemVenda.getProduto();
    }


}
