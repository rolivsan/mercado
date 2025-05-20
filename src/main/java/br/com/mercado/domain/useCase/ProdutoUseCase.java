package br.com.mercado.domain.useCase;

import br.com.mercado.domain.dto.request.ProdutoRequest;
import br.com.mercado.domain.dto.response.ProdutoResponse;
import br.com.mercado.domain.mapper.ProdutoMapper;
import br.com.mercado.domain.model.Produto;
import br.com.mercado.domain.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProdutoUseCase {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }

    public ProdutoResponse create(ProdutoRequest produtoRequest) throws Exception {
        for (Produto prodt: produtoRepository.findAll()){
            if (prodt.getNome().equals(produtoRequest.getNome())){
                throw new Exception("Produto já cadastrado");
            }
        }

        Produto produto = ProdutoMapper.toEntity(produtoRequest);

        Produto ProdutoSaved = produtoRepository.save(produto);

        return ProdutoMapper.toResponse(ProdutoSaved);
    }
}
