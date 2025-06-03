package br.com.mercado.domain.useCase;

import br.com.mercado.domain.dto.request.MercadoRequest;
import br.com.mercado.domain.enums.ErrorCode;
import br.com.mercado.domain.exception.BusinessException;
import br.com.mercado.domain.mapper.MercadoMapper;
import br.com.mercado.domain.model.Fornecedor;
import br.com.mercado.domain.model.Mercado;
import br.com.mercado.domain.repository.FornecedorRepository;
import br.com.mercado.domain.repository.MercadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MercadoUseCase {

    @Autowired
    MercadoRepository mercadoRepository;


    @Autowired
    FornecedorRepository fornecedorRepository;

    public List<Mercado> getAll() {
        //TODO ELAINE  - Implementar o dto para mercado retornando apenas os dados do mercado

        return mercadoRepository.findAll();
    }

    public void create(MercadoRequest mercadoRequest) throws Exception {
        //TODO ELAINE - implementar a busca por cnpj
        Optional<Mercado> mercadoEncontrado = mercadoRepository.findByCnpj(mercadoRequest.getCnpj());
        if (mercadoEncontrado.isPresent()) {
            throw new BusinessException(ErrorCode.MERCADO_EXISTS);
        }
//        for (Mercado mer : mercadoRepository.findAll()) {
//            if (mer.getCnpj().equalsIgnoreCase(mercadoRequest.getCnpj())) {
//                throw new Exception("mercado ja existe");
//            }
//        }

       for(String cnpjFornecedor : mercadoRequest.getCnpjFornecedor()){

       }

        Optional<Fornecedor> fornecedorEncontrado = fornecedorRepository.findByCnpj(mercadoRequest.getCnpjFornecedor().toString());
        if(fornecedorEncontrado.isPresent()){
            throw new BusinessException(ErrorCode.FORNECEDOR_EXISTS);
        }

        Mercado entity = MercadoMapper.toEntity(mercadoRequest);
        mercadoRepository.save(entity);
    }
}
