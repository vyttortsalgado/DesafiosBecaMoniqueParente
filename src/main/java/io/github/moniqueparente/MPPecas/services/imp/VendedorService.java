package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.Vendedor;
import io.github.moniqueparente.MPPecas.repositorio.VendedorRepository;
import io.github.moniqueparente.MPPecas.services.VendedorServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendedorService implements VendedorServiceInterface {

    @Autowired
    private VendedorRepository vendedorRepositorio;

    public Vendedor criar (Vendedor vendedor){
        Vendedor vendedorSalvo = vendedorRepositorio.save(vendedor);

        return vendedorSalvo;
    }

    public Vendedor atualizar (Vendedor vendedor, Integer id){
        Vendedor vendedorObtido = this.obter(id);
        vendedorObtido.setNome(vendedor.getNome());

        vendedorRepositorio.save(vendedorObtido);

        return vendedor;
    }

    public void deletar (Integer id) {
        vendedorRepositorio.deleteById(id);

    }

    public List<Vendedor> listar() {

            List<Vendedor> listaVendedor = vendedorRepositorio.findAll();

        return  listaVendedor;
    }

    public Vendedor obter (Integer id){
        Vendedor vendedor = vendedorRepositorio.findById(id).get();

        return  vendedor;
    }
}
