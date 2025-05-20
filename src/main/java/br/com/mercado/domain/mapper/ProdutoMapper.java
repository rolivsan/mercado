package br.com.mercado.domain.mapper;

import br.com.mercado.domain.dto.request.ProdutoRequest;
import br.com.mercado.domain.dto.response.ProdutoResponse;
import br.com.mercado.domain.model.Produto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProdutoMapper {

    public static Produto toEntity(ProdutoRequest request) {
        return Produto.builder()
                .nome(request.getNome())
                .build();
    }

    public static ProdutoResponse toResponse(Produto produto) {
        return ProdutoResponse.builder()
                .nome(produto.getNome())
                .build();
    }
}
