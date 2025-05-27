package br.com.mercado.domain.repository;

import br.com.mercado.domain.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

// duvidas pq o tipo é sem pre long
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    Optional<Funcionario> findByMercadoId(String mercadoId);
}
