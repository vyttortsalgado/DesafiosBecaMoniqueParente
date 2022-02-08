package io.github.moniqueparente.MPPecas.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //@Positive(message = "{valor.not.valid}")
    private Double valor;

    //@Min(value = 1, message = "{quantidade.not.valid}")
    private Integer quantidade;

    @OneToOne
    private Produto produto;

}
