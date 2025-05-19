package br.com.mercado.domain.controller;

import br.com.mercado.domain.model.Fornecedor;
import br.com.mercado.domain.model.Funcionario;
import br.com.mercado.domain.service.FornecedorService;
import br.com.mercado.domain.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {
    @Autowired
    FuncionarioService funcionarioServiceService;

    @GetMapping
    public List<Funcionario> getAll() {
        return funcionarioServiceService.getAll();
    }

    //TODO Create

    //TODO Read

    //TODO Update

    //TODO Delete

}
