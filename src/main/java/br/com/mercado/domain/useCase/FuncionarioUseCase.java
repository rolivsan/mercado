package br.com.mercado.domain.useCase;

import br.com.mercado.domain.dto.request.FuncionarioRequest;
import br.com.mercado.domain.dto.response.FuncionarioResponse;
import br.com.mercado.domain.mapper.FuncionarioMapper;
import br.com.mercado.domain.model.Funcionario;
import br.com.mercado.domain.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FuncionarioUseCase {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    public List<Funcionario> getAll() { return funcionarioRepository.findAll(); }
    public FuncionarioResponse create(FuncionarioRequest funcionarioRequest) throws Exception {
        //TODO implementar a chamada por nome SELECT * FROM FUNCIONARIOS WHERE FUNCIONARIOS.NOME = 'Alberto'
        for(Funcionario func : funcionarioRepository.findAll()){
            if(func.getNome().equalsIgnoreCase(funcionarioRequest.getNome()) &&
                    func.getCpf().equals(funcionarioRequest.getCpf())){
                throw new Exception("funcionario ja existe");
            }
        }

        Funcionario funcionario = FuncionarioMapper.toEntity(funcionarioRequest);
        Funcionario funcionarioSaved = funcionarioRepository.save(funcionario);

        return FuncionarioMapper.toResponse(funcionarioSaved) ;
    }
}
