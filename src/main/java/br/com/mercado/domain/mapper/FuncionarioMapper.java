package br.com.mercado.domain.mapper;

import br.com.mercado.domain.dto.request.FuncionarioRequest;
import br.com.mercado.domain.dto.response.FuncionarioResponse;
import br.com.mercado.domain.model.Funcionario;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FuncionarioMapper {
    public static Funcionario toEntity(FuncionarioRequest request) {
        return Funcionario.builder()
                .nome(request.getNome())
                .cpf(request.getCpf())
                .build();
    }

    public static FuncionarioResponse toResponse(Funcionario funcionario) {
        return FuncionarioResponse.builder()
                .nome(funcionario.getNome())
                .build();
    }
}
