package br.com.mercado.domain.controller;

import br.com.mercado.domain.dto.request.FornecedorRequest;
import br.com.mercado.domain.dto.response.FornecedorResponse;
import br.com.mercado.domain.model.Categoria;
import br.com.mercado.domain.model.Fornecedor;
import br.com.mercado.domain.model.Produto;
import br.com.mercado.domain.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/fornecedor")
public class FornecedorController {

    @Autowired
    FornecedorService fornecedorService;

    @GetMapping
    public List<Fornecedor> getAll() {

        return fornecedorService.getAll();
    }

    //TODO Create
    @PostMapping
    ResponseEntity<FornecedorResponse> create(@RequestBody FornecedorRequest fornecedorRequest) throws Exception {
        FornecedorResponse fornecedorResponse = fornecedorService.create(fornecedorRequest);
        return ResponseEntity.status(201).body(fornecedorResponse);
    }
}

    //TODO Read

    //TODO Update

    //TODO Delete


