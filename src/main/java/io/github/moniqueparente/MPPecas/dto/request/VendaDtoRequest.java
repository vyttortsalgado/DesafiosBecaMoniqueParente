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

    @NotBlank(message = "Por favor, preencha estes campos!")
    private VendedorDtoRequest vendedor;

    @NotBlank(message = "Por favor, preencha estes campos!")
    private ClienteDtoRequest cliente;

    @NotBlank(message = "Por favor, preencha os campos!")
    private List<ItemVenda> itemVendaLista;
}