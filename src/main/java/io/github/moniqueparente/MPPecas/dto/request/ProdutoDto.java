package io.github.moniqueparente.MPPecas.dto.request;

import io.github.moniqueparente.MPPecas.domains.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDto {

    private String nome;
    private String marca;

    public ProdutoDto(Produto produto) {
        this.nome = produto.getNome();
        this.marca = produto.getMarca();
    }

}


