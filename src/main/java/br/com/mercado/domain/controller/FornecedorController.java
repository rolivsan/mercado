package br.com.mercado.domain.controller;

import br.com.mercado.domain.model.Categoria;
import br.com.mercado.domain.model.Fornecedor;
import br.com.mercado.domain.model.Produto;
import br.com.mercado.domain.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

    //TODO Read

    //TODO Update

    //TODO Delete

    //TODO Create
