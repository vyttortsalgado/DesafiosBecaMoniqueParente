package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.Produto;
import io.github.moniqueparente.MPPecas.dto.request.ProdutoDto;
import io.github.moniqueparente.MPPecas.repository.ProdutoRepository;
import io.github.moniqueparente.MPPecas.services.ProdutoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService implements ProdutoServiceInterface {

    @Autowired
    private ProdutoRepository produtoRepositorio;
    private Object Produto;
    private Object List;

    public ProdutoDto criar (Produto produto){

        Produto produtosalvo = produtoRepositorio.save(produto);

        return new ProdutoDto(produto);
    }

    public Produto atualizar (ProdutoDto produtoDto, Integer id){

        return produtoRepositorio.findById(id)
                .map(itemVenda -> {
                    itemVenda.setNome(produtoDto.getNome());
                    return produtoRepositorio.save(itemVenda);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public void deletar (Integer id) {

        produtoRepositorio.deleteById(id);
    }

    public List<ProdutoDto> listar() {

        List<ProdutoDto> listaProdutoDto = new ArrayList<>();

        produtoRepositorio.findAll().stream()
                .forEach(produto -> listaProdutoDto.add(new ProdutoDto(produto)));

        return listaProdutoDto;
    }

    public ProdutoDto obter (Integer id){

        return new ProdutoDto(produtoRepositorio.findById(id).get());
    }

}

