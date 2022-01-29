package io.github.moniqueparente.MPPecas.repositorio;

import io.github.moniqueparente.MPPecas.domains.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {


}
