package br.com.mercado.domain.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProdutoRequest {
    private String nome;
    private String marca;

}
