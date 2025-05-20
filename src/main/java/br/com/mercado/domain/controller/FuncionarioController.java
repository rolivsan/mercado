package br.com.mercado.domain.controller;

import br.com.mercado.domain.dto.request.FuncionarioRequest;
import br.com.mercado.domain.dto.response.FuncionarioResponse;
import br.com.mercado.domain.model.Fornecedor;
import br.com.mercado.domain.model.Funcionario;
import br.com.mercado.domain.service.FornecedorService;
import br.com.mercado.domain.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    ResponseEntity<FuncionarioResponse> create(@RequestBody FuncionarioRequest funcionarioRequest) throws Exception {
        FuncionarioResponse funcionarioResponse = funcionarioServiceService.create(funcionarioRequest);
        return ResponseEntity.status(201).body(funcionarioResponse);
    }

    //TODO Read

    //TODO Update

    //TODO Delete

}
