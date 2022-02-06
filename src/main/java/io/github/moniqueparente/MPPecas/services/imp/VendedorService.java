package io.github.moniqueparente.MPPecas.services.imp;

import io.github.moniqueparente.MPPecas.domains.Vendedor;
import io.github.moniqueparente.MPPecas.dto.request.VendedorDtoRequest;
import io.github.moniqueparente.MPPecas.dto.response.VendedorDtoResponse;
import io.github.moniqueparente.MPPecas.mappers.MapperVendedorAtualizar;
import io.github.moniqueparente.MPPecas.mappers.MapperVendedorRequestToVendedor;
import io.github.moniqueparente.MPPecas.mappers.MapperVendedorToVendedorResponse;
import io.github.moniqueparente.MPPecas.repository.VendedorRepository;
import io.github.moniqueparente.MPPecas.services.VendedorServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class VendedorService implements VendedorServiceInterface {

    private final VendedorRepository vendedorRepository;
    private final MapperVendedorRequestToVendedor mapperVendedorRequestToVendedor;
    private final MapperVendedorToVendedorResponse mapperVendedorToVendedorResponse;
    private final MapperVendedorAtualizar mapperVendedorAtualizar;


    public VendedorDtoResponse criar (@Valid VendedorDtoRequest vendedorDtoRequest){
        Vendedor vendedor = mapperVendedorRequestToVendedor.toModel(vendedorDtoRequest);

        vendedorRepository.save(vendedor);

        VendedorDtoResponse vendedorDtoResponse = mapperVendedorToVendedorResponse.toResponse(vendedor);

        return  vendedorDtoResponse;
    }

    public VendedorDtoResponse atualizar (VendedorDtoRequest vendedorDtoRequest, Integer id){
        Vendedor vendedorObtido = vendedorRepository.findById(id).get();

        mapperVendedorAtualizar.atualizar(vendedorDtoRequest, vendedorObtido);

        vendedorRepository.save(vendedorObtido);

        return mapperVendedorToVendedorResponse.toResponse(vendedorObtido);

    }

    public void deletar (Integer id) {

        vendedorRepository.deleteById(id);
    }

    public List<VendedorDtoResponse> listar() {

        List<Vendedor> listaVendedor = vendedorRepository.findAll();

        return listaVendedor
                .stream()
                .map(mapperVendedorToVendedorResponse::toResponse)
                .collect(Collectors.toList());

    }

    public VendedorDtoResponse obter (Integer id){
        Vendedor vendedor = vendedorRepository.findById(id).get();

        return mapperVendedorToVendedorResponse.toResponse(vendedor);
    }
}
