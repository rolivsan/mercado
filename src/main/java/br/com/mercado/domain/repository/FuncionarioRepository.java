package br.com.mercado.domain.repository;

import br.com.mercado.domain.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    List<Funcionario> findByMercadoId(Long mercadoId);
}
