package io.github.moniqueparente.MPPecas.dto.response;

import io.github.moniqueparente.MPPecas.domains.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDtoResponse extends Produto {

    private String nome;
    private String marca;
}
