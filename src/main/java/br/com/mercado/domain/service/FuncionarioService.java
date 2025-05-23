package br.com.mercado.domain.service;

import br.com.mercado.domain.dto.request.FuncionarioRequest;
import br.com.mercado.domain.dto.response.FuncionarioResponse;
import br.com.mercado.domain.model.Categoria;
import br.com.mercado.domain.model.Funcionario;
import br.com.mercado.domain.useCase.CategoriaUseCase;
import br.com.mercado.domain.useCase.FuncionarioUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FuncionarioService {

    @Autowired
    FuncionarioUseCase funcionarioUseCase;

    public List<Funcionario> getAll() {
        return funcionarioUseCase.getAll();
    }

    public FuncionarioResponse create(FuncionarioRequest funcionarioRequest) throws Exception {
        return funcionarioUseCase.create(funcionarioRequest);
    }
}
