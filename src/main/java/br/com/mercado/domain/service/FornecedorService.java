package br.com.mercado.domain.service;

import br.com.mercado.domain.dto.request.FornecedorRequest;
import br.com.mercado.domain.dto.response.FornecedorResponse;
import br.com.mercado.domain.model.Categoria;
import br.com.mercado.domain.model.Fornecedor;
import br.com.mercado.domain.model.Produto;
import br.com.mercado.domain.useCase.CategoriaUseCase;
import br.com.mercado.domain.useCase.FornecedorUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FornecedorService {

    @Autowired
    FornecedorUseCase fornecedorUseCase;

    public List<Fornecedor> getAll() {
        return fornecedorUseCase.getAll();
    }

    public FornecedorResponse create(FornecedorRequest fornecedorRequest) throws Exception {
        return fornecedorUseCase.create(fornecedorRequest);
    }
}
