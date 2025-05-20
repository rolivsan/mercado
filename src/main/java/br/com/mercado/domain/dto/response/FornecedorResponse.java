package br.com.mercado.domain.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FornecedorResponse {
    private String nome;
    private String cnpj;
}
