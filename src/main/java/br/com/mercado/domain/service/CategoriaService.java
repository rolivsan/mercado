package br.com.mercado.domain.service;



import br.com.mercado.domain.dto.request.CategoriaRequest;
import br.com.mercado.domain.dto.response.CategoriaResponse;
import br.com.mercado.domain.model.Categoria;
import br.com.mercado.domain.useCase.CategoriaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    CategoriaUseCase categoriaUseCase;

    public List<Categoria> getAll() {
        return categoriaUseCase.getAll();
    }

    public CategoriaResponse create(CategoriaRequest categoriaRequest){
        return categoriaUseCase.create(categoriaRequest);
    }
}
