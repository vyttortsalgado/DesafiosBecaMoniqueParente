package io.github.moniqueparente.MPPecas.dto.response;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.domains.Venda;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendaDtoResponse extends Venda {

    private VendedorDtoResponse vendedor;
    private ClienteDtoResponse cliente;
    private List<ItemVenda> itemVendaLista;


}
