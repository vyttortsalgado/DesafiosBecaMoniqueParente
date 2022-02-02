package io.github.moniqueparente.MPPecas.dto.request;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import io.github.moniqueparente.MPPecas.domains.Produto;
import io.github.moniqueparente.MPPecas.domains.Vendedor;

import java.util.List;


public class VendaDto {
    private String vendedorNome;
    private String clienteNome;
    private List<ItemVendaDto> itemVendaLista;

    public VendaDto() {

    }

    public VendaDto(String vendedorNome, String clienteNome, List<ItemVendaDto> itemVendaLista) {
        this.vendedorNome = vendedorNome;
        this.clienteNome = clienteNome;
        this.itemVendaLista = itemVendaLista;
    }

    public VendaDto(Vendedor vendedor, Cliente cliente, List<ItemVendaDto> itemVendaLista) {
        vendedorNome = vendedor.getNome();
        clienteNome = cliente.getNome();
        List<ItemVenda> getItemVendaLista;
    }

    public String getVendedorNome() {
        return vendedorNome;
    }

    public void setVendedorNome(String vendedorNome) {
        this.vendedorNome = vendedorNome;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public List<ItemVendaDto> getItemVendaLista() {
        return itemVendaLista;
    }

    public void setItemVendaLista(List<ItemVendaDto> itemVendaLista) {
        this.itemVendaLista = itemVendaLista;
    }

    public static class ItemVendaDto {
        private Double valor;
        private Integer quantidade;
        private String produtoNome;
        private String produtoMarca;

        public ItemVendaDto() {
        }

        public ItemVendaDto(Double valor, Integer quantidade, String produtoNome, String produtoMarca) {
            this.valor = valor;
            this.quantidade = quantidade;
            this.produtoNome = produtoNome;
            this.produtoMarca = produtoMarca;
        }

        public ItemVendaDto(ItemVenda itemVenda, Produto produto) {
            valor = itemVenda.getValor();
            quantidade = itemVenda.getQuantidade();
            produtoNome = produto.getNome();
            produtoMarca = produto.getMarca();
        }

        public Double getValor() {
            return valor;
        }

        public void setValor(Double valor) {
            this.valor = valor;
        }

        public Integer getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(Integer quantidade) {
            this.quantidade = quantidade;
        }

        public String getProdutoNome() {
            return produtoNome;
        }

        public void setProdutoNome(String produtoNome) {
            this.produtoNome = produtoNome;
        }

        public String getProdutoMarca() {
            return produtoMarca;
        }

        public void setProdutoMarca(String produtoMarca) {
            this.produtoMarca = produtoMarca;
        }
    }
}
