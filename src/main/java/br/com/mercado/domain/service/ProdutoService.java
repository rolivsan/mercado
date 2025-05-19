package br.com.mercado.domain.service;

import br.com.mercado.domain.model.Produto;
import br.com.mercado.domain.useCase.PrdutoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProdutoService {

    @Autowired
    PrdutoUseCase produtoUseCase;

    public List<Produto> getAll() {
        return produtoUseCase.getAll();
    }
}
