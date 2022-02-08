package io.github.moniqueparente.MPPecas.exceptions.handle;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DefaultException {
    private Integer status;
    private String messagem;
    private LocalDateTime dataHora;
}
