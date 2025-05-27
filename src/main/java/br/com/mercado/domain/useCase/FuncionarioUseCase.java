package br.com.mercado.domain.useCase;

import br.com.mercado.domain.dto.request.FuncionarioRequest;
import br.com.mercado.domain.dto.response.FuncionarioResponse;
import br.com.mercado.domain.enums.ErrorCode;
import br.com.mercado.domain.exception.BusinessException;
import br.com.mercado.domain.mapper.FuncionarioMapper;
import br.com.mercado.domain.model.Funcionario;
import br.com.mercado.domain.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FuncionarioUseCase {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    public List<Funcionario> getAll() { return funcionarioRepository.findAll(); }

    public FuncionarioResponse create(FuncionarioRequest funcionarioRequest) {
        Optional<Funcionario> funcionarioEncontrado = funcionarioRepository.findByMercadoId
                (funcionarioRequest.getCpf());
        if (funcionarioEncontrado.isPresent()){
            throw new BusinessException(ErrorCode.FUNCIONARIO_EXISTS);
        }

        Funcionario funcionario = FuncionarioMapper.toEntity(funcionarioRequest);

        Funcionario funcionarioSaved = funcionarioRepository.save(funcionario);

        return FuncionarioMapper.toResponse(funcionarioSaved) ;
    }
}
