package io.github.moniqueparente.MPPecas.dto.request;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendaDtoRequest {

    private Integer id;

    private VendedorDtoRequest vendedor;
    private ClienteDtoRequest cliente;
    private List<ItemVenda> itemVendaLista;
}