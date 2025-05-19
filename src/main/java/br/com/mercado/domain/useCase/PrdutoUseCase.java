package br.com.mercado.domain.useCase;

import br.com.mercado.domain.model.Produto;
import br.com.mercado.domain.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PrdutoUseCase {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }
}
