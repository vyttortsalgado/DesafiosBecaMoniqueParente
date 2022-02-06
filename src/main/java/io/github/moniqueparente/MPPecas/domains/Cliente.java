package io.github.moniqueparente.MPPecas.domains;

import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Por favor preencha o campo")
    @Pattern(regexp = "^[A-Z]+(.)*", message = "Inicie com letra maiúscula")
    private String nome;

    @CPF(message = "Por favor preencha o campo")
    @NotBlank(message = "Por favor preencha o campo")
    private String cpf;

}
