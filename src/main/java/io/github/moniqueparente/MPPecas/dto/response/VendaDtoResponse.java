package io.github.moniqueparente.MPPecas.dto.response;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class VendaDtoResponse {

    private VendedorDtoResponse vendedor;
    private ClienteDtoResponse cliente;
    private List<ItemVenda> itemVendaLista;

    private LocalDateTime dataVenda = LocalDateTime.now();


}
