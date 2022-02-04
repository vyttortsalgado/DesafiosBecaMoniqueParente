package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.Vendedor;
import io.github.moniqueparente.MPPecas.dto.request.VendedorDto;
import io.github.moniqueparente.MPPecas.mappers.VendedorMapper;
import io.github.moniqueparente.MPPecas.repository.VendedorRepository;
import io.github.moniqueparente.MPPecas.services.VendedorServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class VendedorService implements VendedorServiceInterface {

    @Autowired
    private VendedorRepository vendedorRepositorio;

    @Autowired
    private VendedorMapper vendedorMapper;

    public VendedorDto criar (Vendedor vendedor){

        Vendedor vendedorsalvo = vendedorRepositorio.save(vendedor);

        return vendedorMapper.vendedorDto(vendedorsalvo);
    }

    public Vendedor atualizar (VendedorDto vendedorDto, Integer id){

        return vendedorRepositorio.findById(id)
                .map(vendedor -> {
                    vendedor.setNome(vendedorDto.getNome());
                    return vendedorRepositorio.save(vendedor);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public void deletar (Integer id) {

        vendedorRepositorio.deleteById(id);
    }

    public List<VendedorDto> listar() {

        List<VendedorDto> listaVendedorDto = new ArrayList<>();

        vendedorRepositorio.findAll().stream()
                .forEach(vendedor -> listaVendedorDto.add(new VendedorDto(vendedor)));

        return listaVendedorDto;
    }

    public VendedorDto obter (Integer id){

        return new VendedorDto(vendedorRepositorio.findById(id).get());
    }
}
