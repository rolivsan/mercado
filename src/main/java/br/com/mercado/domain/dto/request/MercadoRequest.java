package br.com.mercado.domain.dto.request;

import lombok.Data;

@Data
public class MercadoRequest {

    private String nome;
    private String endereco;
    private String cnpj;

}
