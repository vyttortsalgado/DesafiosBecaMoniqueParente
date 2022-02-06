package io.github.moniqueparente.MPPecas.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendedorDtoRequest extends VendaDtoRequest {

    private Integer id;
    private String nome;
}
