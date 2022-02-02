package io.github.moniqueparente.MPPecas.repository;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemVendaRepository extends JpaRepository<ItemVenda, Integer> {

}
