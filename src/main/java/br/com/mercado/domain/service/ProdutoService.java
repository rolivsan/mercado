package br.com.mercado.domain.service;

import br.com.mercado.domain.dto.request.ProdutoRequest;
import br.com.mercado.domain.dto.response.ProdutoResponse;
import br.com.mercado.domain.model.Produto;
import br.com.mercado.domain.useCase.ProdutoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProdutoService {

    @Autowired
    ProdutoUseCase produtoUseCase;

    public List<Produto> getAll() {
        return produtoUseCase.getAll();
    }
    public ProdutoResponse create(ProdutoRequest produtoRequest) throws Exception {
        return produtoUseCase.create(produtoRequest);
    }
}
