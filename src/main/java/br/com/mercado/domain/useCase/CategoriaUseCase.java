package br.com.mercado.domain.useCase;

import br.com.mercado.domain.dto.request.CategoriaRequest;
import br.com.mercado.domain.dto.response.CategoriaResponse;
import br.com.mercado.domain.mapper.CategoriaMapper;
import br.com.mercado.domain.model.Categoria;
import br.com.mercado.domain.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoriaUseCase {

    @Autowired
    CategoriaRepository categoriaRepository;

    public List<Categoria> getAll() {
        return categoriaRepository.findAll();
    }

    public CategoriaResponse create(CategoriaRequest categoriaRequest) throws Exception {
        //TODO implementar a chamada por nome SELECT * FROM CATEGORIAS WHERE CATEGORIAS.NOME = 'Alimentos'
        for(Categoria cat : categoriaRepository.findAll()){
            if(cat.getNome().equalsIgnoreCase(categoriaRequest.getNome())){
                throw new Exception("categoria ja existe");
            }
        }

        //select * from categoria where categoria.nome ="x"

        Categoria categoria = CategoriaMapper.toEntity(categoriaRequest);

        Categoria CategoriaSaved = categoriaRepository.save(categoria);

        return CategoriaMapper.toResponse(CategoriaSaved);
    }
}
