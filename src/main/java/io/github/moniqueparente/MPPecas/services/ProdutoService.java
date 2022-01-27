package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.Produto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProdutoService {

        public Produto criar (Produto produto){
            produto.setId(1);

            return produto;
        }

        public Produto atualizar (Produto produto, Integer id){
            produto.setId(id);

            return produto;
        }

        public void deletar (Integer id) {

        }

        public List<Produto> listar() {

            Produto produto1 = new Produto();
            produto1.setId(1);
            produto1.setNome("Teclado");
            produto1.setMarca("Redragon");

            Produto produto2 = new Produto();
            produto2.setId(2);
            produto2.setNome("Notebook");
            produto2.setMarca("Alienware");

            Produto produto3 = new Produto();
            produto3.setId(3);
            produto3.setNome("Mouse");
            produto3.setMarca("Dell");

            List<Produto> listaProduto = Arrays.asList(produto1,produto2,produto3);

            return listaProduto;
        }

        public Produto obter (Integer id){
            System.out.println("Obterve id: " +id);

            Produto produto1 = new Produto();
            produto1.setId(1);
            produto1.setNome("Teclado");
            produto1.setMarca("Redragon");

            return produto1;

        }

    }

