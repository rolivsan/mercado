package br.com.mercado.domain.repository;

import br.com.mercado.domain.model.Mercado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MercadoRepository extends JpaRepository<Mercado, Long> {
}
