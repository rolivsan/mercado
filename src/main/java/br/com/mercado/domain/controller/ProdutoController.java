package br.com.mercado.domain.controller;

import br.com.mercado.domain.model.Produto;
import br.com.mercado.domain.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
    @Autowired
    ProdutoService produtoService;

    @GetMapping
    public List<Produto> getAll() {
        return produtoService.getAll();
    }

    //TODO Create

    //TODO Read

    //TODO Update

    //TODO Delete

}
