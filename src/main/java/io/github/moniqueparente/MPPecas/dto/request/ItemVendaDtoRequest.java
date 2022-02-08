package io.github.moniqueparente.MPPecas.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemVendaDtoRequest {

    private Integer id;

    @Positive(message = "Por favor, preencha um valor maior do que Zero.")
    private Double valor;

    @Min(value = 1,message = "Por favor, preencha um valor maior do que Zero.")
    private Integer quantidade;

    private ProdutoDtoRequest produto;
}
