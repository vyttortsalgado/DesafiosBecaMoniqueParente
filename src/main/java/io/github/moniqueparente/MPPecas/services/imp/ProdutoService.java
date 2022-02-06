package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.Produto;
import io.github.moniqueparente.MPPecas.dto.request.ProdutoDtoRequest;
import io.github.moniqueparente.MPPecas.dto.response.ProdutoDtoResponse;
import io.github.moniqueparente.MPPecas.mappers.MapperProdutoAtualizar;
import io.github.moniqueparente.MPPecas.mappers.MapperProdutoRequestToProduto;
import io.github.moniqueparente.MPPecas.mappers.MapperProdutoToProdutoResponse;
import io.github.moniqueparente.MPPecas.repository.ProdutoRepository;
import io.github.moniqueparente.MPPecas.services.ProdutoServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProdutoService implements ProdutoServiceInterface {


    private final ProdutoRepository produtoRepository;
    private final MapperProdutoRequestToProduto mapperProdutoRequestToProduto;
    private final MapperProdutoToProdutoResponse mapperProdutoToProdutoResponse;
    private final MapperProdutoAtualizar mapperProdutoAtualizar;


    public ProdutoDtoResponse criar (@Valid ProdutoDtoRequest produtoDtoRequest){
        Produto produto = mapperProdutoRequestToProduto.toModel(produtoDtoRequest);

        produtoRepository.save(produto);

        ProdutoDtoResponse produtoDtoResponse = mapperProdutoToProdutoResponse.toResponse(produto);

        return produtoDtoResponse;
    }

    public ProdutoDtoResponse atualizar (ProdutoDtoRequest produtoDtoRequest, Integer id){
        Produto produtoObtido = produtoRepository.findById(id).get();

        mapperProdutoAtualizar.atualizar(produtoDtoRequest, produtoObtido);

        produtoRepository.save(produtoObtido);

        return mapperProdutoToProdutoResponse.toResponse(produtoObtido);
    }

    public void deletar (Integer id) {

        produtoRepository.deleteById(id);
    }

    public List<ProdutoDtoResponse> listar() {

        List<Produto> listaProduto = produtoRepository.findAll();

       return listaProduto
                .stream()
                .map(mapperProdutoToProdutoResponse::toResponse)
                .collect(Collectors.toList());

    }

    public ProdutoDtoResponse obter (Integer id){
        Produto produto = produtoRepository.findById(id).get();

        return mapperProdutoToProdutoResponse.toResponse(produto);
    }
}

