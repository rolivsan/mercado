package br.com.mercado.domain.useCase;

import br.com.mercado.domain.dto.request.CategoriaRequest;
import br.com.mercado.domain.dto.response.CategoriaResponse;
import br.com.mercado.domain.enums.ErrorCode;
import br.com.mercado.domain.exception.BusinessException;
import br.com.mercado.domain.mapper.CategoriaMapper;
import br.com.mercado.domain.model.Categoria;
import br.com.mercado.domain.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CategoriaUseCase {

    @Autowired
    CategoriaRepository categoriaRepository;

    public List<Categoria> getAll() {
        return categoriaRepository.findAll();
    }

    public CategoriaResponse create(CategoriaRequest categoriaRequest) {
        Optional<Categoria> categoriaEncontrada = categoriaRepository.findByNome(categoriaRequest.getNome());
        if(categoriaEncontrada.isPresent()){
            throw  new BusinessException(ErrorCode.CATEGORIA_EXISTS);
        }

        Categoria categoria = CategoriaMapper.toEntity(categoriaRequest);

        Categoria CategoriaSaved = categoriaRepository.save(categoria);

        return CategoriaMapper.toResponse(CategoriaSaved);
    }
}
