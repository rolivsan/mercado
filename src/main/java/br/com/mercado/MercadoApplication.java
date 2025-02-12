package br.com.mercado;

import br.com.mercado.domain.model.Categoria;
import br.com.mercado.domain.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MercadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MercadoApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(@Autowired
			CategoriaRepository categoriaRepository) {
		return args -> {
			// Criando três categorias
			Categoria categoria1 = Categoria.builder()
					.nome("Alimentos")
					.build();

			Categoria categoria2 = Categoria.builder()
					.nome("Bebidas")
					.build();

			Categoria categoria3 = Categoria.builder()
					.nome("Limpeza")
					.build();

			// Salvando as categorias no banco
			categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2, categoria3));

			System.out.println("Categorias salvas com sucesso!");
		};
	}

}
