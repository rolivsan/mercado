package br.com.mercado.domain.repository;

import br.com.mercado.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByFornecedorId(Long fornecedorId);
    List<Produto> findByCategoriaId(Long categoriaId);
    Optional<Produto> findByNameAndMarca(String name, String marca);
}

