package br.com.mercado.domain.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FuncionarioResponse {
    private String nome;
}
