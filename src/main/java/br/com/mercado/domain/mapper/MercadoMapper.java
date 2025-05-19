package br.com.mercado.domain.mapper;

import br.com.mercado.domain.dto.request.MercadoRequest;
import br.com.mercado.domain.model.Mercado;

public class MercadoMapper {

    public static Mercado toEntity(MercadoRequest request){
        return Mercado.builder()
                .cnpj(request.getCnpj())
                .endereco(request.getEndereco())
                .nome(request.getNome())
                .build();
    }

}
