package br.com.mercado.domain.dto.request;

import br.com.mercado.domain.model.Produto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class CategoriaRequest {

    private String nome;

}
