package io.github.moniqueparente.MPPecas.repository;

import io.github.moniqueparente.MPPecas.domains.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Integer> {

}