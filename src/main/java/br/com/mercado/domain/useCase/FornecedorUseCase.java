package br.com.mercado.domain.useCase;

import br.com.mercado.domain.dto.request.FornecedorRequest;
import br.com.mercado.domain.dto.response.FornecedorResponse;
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
@Component
public class FornecedorUseCase {

    @Autowired
    FornecedorRepository fornecedorRepository;

    public List<Fornecedor> getAll() {
        return fornecedorRepository.findAll();
    }

    public FornecedorResponse create(FornecedorRequest fornecedorRequest) throws Exception {
        for (Fornecedor forn : fornecedorRepository.findAll()) {
            if (forn.getNome().equalsIgnoreCase(fornecedorRequest.getNome())) {
                throw new Exception("fornecedor ja existe");
            }
        }
        Fornecedor fornecedor = FornecedorMapper.toEntity(fornecedorRequest);

        Fornecedor fornecedorSaved = fornecedorRepository.save(fornecedor);

        return FornecedorMapper.toResponse(fornecedorSaved);
    }
}
