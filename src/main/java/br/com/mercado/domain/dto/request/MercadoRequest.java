package br.com.mercado.domain.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class MercadoRequest {

    private String nome;
    private String endereco;
    private String cnpj;
    private List<String> cnpjFornecedor;

}
