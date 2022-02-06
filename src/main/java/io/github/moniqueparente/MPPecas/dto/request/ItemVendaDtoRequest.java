package io.github.moniqueparente.MPPecas.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemVendaDtoRequest {

    private Integer id;
    private Double valor;
    private Integer quantidade;
    private ProdutoDtoRequest produto;
}
