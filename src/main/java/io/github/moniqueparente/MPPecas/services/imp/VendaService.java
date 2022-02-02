package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.Venda;
import io.github.moniqueparente.MPPecas.repositorio.VendaRepository;
import io.github.moniqueparente.MPPecas.services.VendaServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendaService implements VendaServiceInterface {

    @Autowired
    private VendaRepository vendaRepositorio;

    public Venda criar(Venda venda) {
        Venda vendaSalvo = vendaRepositorio.save(venda);

        return vendaSalvo;
    }

    public Venda atualizar(Venda venda, Integer id) {

        Venda vendaObtida = this.obter(id);
        vendaRepositorio.save(vendaObtida);
        vendaObtida.setCliente(vendaObtida.getCliente());
        vendaObtida.setVendedor(vendaObtida.getVendedor());
        vendaObtida.setItemVendaLista(vendaObtida.getItemVendaLista());

        vendaRepositorio.save(vendaObtida);

        return venda;

    }

    public void deletar (Integer id) {
        vendaRepositorio.deleteById(id);
    }

    public List<Venda> listar() {

        List<Venda> listaVenda = vendaRepositorio.findAll();

        return listaVenda;

    }

    public Venda obter (Integer id){
        Optional<Venda> obj = vendaRepositorio.findById(id);

        return obj.get();

    }

}
