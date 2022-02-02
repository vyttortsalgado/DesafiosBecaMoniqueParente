package io.github.moniqueparente.MPPecas.repository;

import io.github.moniqueparente.MPPecas.domains.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
