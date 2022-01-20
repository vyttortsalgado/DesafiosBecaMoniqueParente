package io.github.moniqueparente.MPPecas.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Estoque implements Serializable {
        private static final Integer serialVersionUID = 1;

        private Integer idEstoque;
        private Integer qtdItem;
        private Boolean statusEstoque;
        private Venda venda;

        public Estoque(Integer idEstoque, Integer qtdItem, Boolean statusEstoque, Venda venda) {
                this.idEstoque = idEstoque;
                this.qtdItem = qtdItem;
                this.statusEstoque = statusEstoque;
                this.venda = venda;
        }

        public Integer getIdEstoque() {

                return idEstoque;
        }

        public void setIdEstoque(Integer idEstoque) {

                this.idEstoque = idEstoque;
        }

        public Integer getQtdItem() {

                return qtdItem;
        }

        public void setQtdItem(Integer qtdItem) {

                this.qtdItem = qtdItem;
        }

        public Boolean getStatusEstoque() {

                return statusEstoque;
        }

        public void setStatusEstoque(Boolean statusEstoque) {

                this.statusEstoque = statusEstoque;
        }

        public Venda getVenda() {
                return venda;
        }

        public void setVenda(Venda venda) {
                this.venda = venda;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Estoque estoque = (Estoque) o;
                return Objects.equals(idEstoque, estoque.idEstoque);
        }

        @Override
        public int hashCode() {
                return Objects.hash(idEstoque);
        }
}
