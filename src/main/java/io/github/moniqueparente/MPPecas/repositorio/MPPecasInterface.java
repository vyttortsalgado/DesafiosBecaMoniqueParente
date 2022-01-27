package io.github.moniqueparente.MPPecas.repositorio;

import java.util.List;

public interface MPPecasInterface <T> {

    T criar (T objeto);
    T atualizar (T objeto ,Integer id);
    void deletar (Integer id);
    List<T> listar() ;
    T obter (Integer id);

}
