package io.github.moniqueparente.MPPecas.repositorio;

import io.github.moniqueparente.MPPecas.domains.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto, Integer> {
}
