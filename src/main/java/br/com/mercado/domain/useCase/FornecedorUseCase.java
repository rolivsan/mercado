package br.com.mercado.domain.useCase;

import br.com.mercado.domain.dto.request.FornecedorRequest;
import br.com.mercado.domain.dto.response.FornecedorResponse;
import br.com.mercado.domain.enums.ErrorCode;
import br.com.mercado.domain.exception.BusinessException;
import br.com.mercado.domain.mapper.FornecedorMapper;
import br.com.mercado.domain.model.Categoria;
import br.com.mercado.domain.model.Fornecedor;
import br.com.mercado.domain.model.Funcionario;
import br.com.mercado.domain.model.Produto;
import br.com.mercado.domain.repository.CategoriaRepository;
import br.com.mercado.domain.repository.FornecedorRepository;
import br.com.mercado.domain.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FornecedorUseCase {

    @Autowired
    FornecedorRepository fornecedorRepository;

    public List<Fornecedor> getAll() {
        return fornecedorRepository.findAll();
    }

    public FornecedorResponse create(FornecedorRequest fornecedorRequest){

        // duvidas se a forma de busca esta correta
        Optional<Fornecedor> fornecedorEncontrado = fornecedorRepository.findByMercadoId(
                (fornecedorRequest.getCnpj()));
        if(fornecedorEncontrado.isPresent()){
                throw new BusinessException(ErrorCode.FORNECEDOR_EXISTS);
        }
        Fornecedor fornecedor = FornecedorMapper.toEntity(fornecedorRequest);

        Fornecedor fornecedorSaved = fornecedorRepository.save(fornecedor);

        return FornecedorMapper.toResponse(fornecedorSaved);
    }
}
