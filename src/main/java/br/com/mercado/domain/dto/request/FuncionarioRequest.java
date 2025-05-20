package br.com.mercado.domain.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FuncionarioRequest {
    private String nome;
    private String cpf;
}
