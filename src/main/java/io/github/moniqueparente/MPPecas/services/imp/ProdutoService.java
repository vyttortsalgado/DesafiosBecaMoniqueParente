package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.Produto;
import io.github.moniqueparente.MPPecas.dto.request.ProdutoDto;
import io.github.moniqueparente.MPPecas.mappers.ProdutoMapper;
import io.github.moniqueparente.MPPecas.repository.ProdutoRepository;
import io.github.moniqueparente.MPPecas.services.ProdutoServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProdutoService implements ProdutoServiceInterface {

    @Autowired
    private ProdutoRepository produtoRepositorio;

    @Autowired
    private ProdutoMapper produtoMapper;

    private Object Produto;
    private Object List;

    public ProdutoDto criar (ProdutoDto produtoDto){

        Produto produtoalvo = produtoRepositorio.save(produtoMapper.produto(produtoDto));
        return produtoMapper.produtoDto(produtoalvo);
    }

    public ProdutoDto atualizar (ProdutoDto produtoDto, Integer id){

        return produtoMapper.produtoDto(produtoRepositorio.findById(id)
                .map(produtoObtidoId -> produtoRepositorio.save(produtoMapper.produto(produtoDto)))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));

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

