package io.github.moniqueparente.MPPecas.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Min(value = 0, message = "A quantidade deve ser acima de Zero")
    private Double valor;

    @Min(value = 0, message = "A quantidade deve ser acima de Zero")
    private Integer quantidade;

    @OneToOne
    private Produto produto;

}
