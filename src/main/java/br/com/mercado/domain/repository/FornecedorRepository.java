package br.com.mercado.domain.repository;

import br.com.mercado.domain.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

    List<Fornecedor> findByMercadoId(Long mercadoId);
}
