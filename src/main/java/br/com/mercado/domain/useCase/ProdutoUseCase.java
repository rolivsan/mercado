package br.com.mercado.domain.useCase;

import br.com.mercado.domain.dto.request.ProdutoRequest;
import br.com.mercado.domain.dto.response.ProdutoResponse;
import br.com.mercado.domain.enums.ErrorCode;
import br.com.mercado.domain.exception.BusinessException;
import br.com.mercado.domain.mapper.ProdutoMapper;
import br.com.mercado.domain.model.Produto;
import br.com.mercado.domain.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProdutoUseCase {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }
    //TODO elaine fazer o findByNomeAndMarca retornando o optional e melhorar as outras querys que existem
    public ProdutoResponse create(ProdutoRequest produtoRequest) {

        Optional<Produto> produtoEncontrado =  produtoRepository.findByNameAndMarca(produtoRequest.getNome(),produtoRequest.getMarca());
        if(produtoEncontrado.isPresent()){
                throw new BusinessException(ErrorCode.PRODUTO_EXISTS);
        }

        Produto produto = ProdutoMapper.toEntity(produtoRequest);

        Produto ProdutoSaved = produtoRepository.save(produto);

        return ProdutoMapper.toResponse(ProdutoSaved);
    }
}
