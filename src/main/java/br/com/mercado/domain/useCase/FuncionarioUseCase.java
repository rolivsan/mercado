package br.com.mercado.domain.useCase;

import br.com.mercado.domain.model.Funcionario;
import br.com.mercado.domain.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FuncionarioUseCase {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    public List<Funcionario> getAll() {
        return funcionarioRepository.findAll();
    }
}
