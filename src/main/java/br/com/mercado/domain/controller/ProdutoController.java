package br.com.mercado.domain.controller;

import br.com.mercado.domain.dto.request.ProdutoRequest;
import br.com.mercado.domain.dto.response.ProdutoResponse;
import br.com.mercado.domain.model.Produto;
import br.com.mercado.domain.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
    @Autowired
    ProdutoService produtoService;

    @GetMapping("/{idMercado}/produto")
    public List<Produto> getAll() {
        return produtoService.getAll();
    }

    @PostMapping
    ResponseEntity<ProdutoResponse> create(@RequestBody ProdutoRequest produtoRequest) throws Exception {
        ProdutoResponse produtoResponse = produtoService.create(produtoRequest);
        return ResponseEntity.status(201).body(produtoResponse);
    }


    //TODO Read

    //TODO Update

    //TODO Delete

}
