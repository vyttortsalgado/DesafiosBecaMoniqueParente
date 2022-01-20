package io.github.moniqueparente.MPPecas.entidades;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Venda implements Serializable {
    private static final Integer serialVersionUID = 1;

    LocalDate agora = LocalDate.now();

    Date dataHoraAtual = new Date();
    String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

    private Integer idVenda;
    private Double valorVenda;
    private Date dataVenda;
    private Boolean statusVenda;

    public Venda(Integer idVenda, Double valorVenda, Date dataVenda, Boolean statusVenda) {
        this.idVenda = idVenda;
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
        this.statusVenda = statusVenda;

    }

    public Integer getIdVenda() {

        return idVenda;
    }

    public void setIdVenda(Integer idVenda)
    {
        this.idVenda = idVenda;
    }

    public Double getvalorVenda(Double valorVenda) {

        return valorVenda;
    }

    public void setvalorVenda(Double valorVenda) {

        this.valorVenda = valorVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {

        this.dataVenda = dataVenda;
    }

    public Boolean getStatusVenda() {

        return statusVenda;
    }

    public void setStatusVenda(Boolean statusVenda) {
        this.statusVenda = statusVenda;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return idVenda.equals(venda.idVenda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVenda);
    }
}
