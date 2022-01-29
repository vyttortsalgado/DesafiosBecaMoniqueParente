package io.github.moniqueparente.MPPecas.services;

import io.github.moniqueparente.MPPecas.domains.Produto;
import io.github.moniqueparente.MPPecas.repositorio.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService{

    @Autowired
    private ProdutoRepository produtoRepositorio;

        public Produto criar (Produto produto){
            Produto produtoSalvo = produtoRepositorio.save(produto);

            return produtoSalvo;
        }

        public Produto atualizar (Produto produto, Integer id){
            Produto produtoObtido = this.obter(id);
            produtoObtido.setNome(produto.getNome());
            produtoObtido.setMarca(produto.getMarca());

            produtoRepositorio.save(produtoObtido);

            return  produtoObtido;
        }

        public void deletar (Integer id) {
            produtoRepositorio.deleteById(id);
        }

        public List<Produto> listar() {
            List<Produto> listaProduto = produtoRepositorio.findAll();

            return listaProduto;
        }

        public Produto obter (Integer id){
            Produto produto = produtoRepositorio.findById(id).get();

            return produto;
        }

    }

