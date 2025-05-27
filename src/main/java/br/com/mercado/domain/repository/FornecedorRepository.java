package br.com.mercado.domain.repository;

import br.com.mercado.domain.model.Fornecedor;
import br.com.mercado.domain.model.Mercado;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

    Optional<Fornecedor> findByMercadoId(String  mercadoId);


}
