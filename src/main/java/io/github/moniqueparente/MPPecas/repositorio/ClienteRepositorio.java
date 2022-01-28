package io.github.moniqueparente.MPPecas.repositorio;


import io.github.moniqueparente.MPPecas.domains.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
}
