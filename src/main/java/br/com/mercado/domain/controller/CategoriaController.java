package br.com.mercado.domain.controller;


import br.com.mercado.domain.dto.request.CategoriaRequest;
import br.com.mercado.domain.dto.request.MercadoRequest;
import br.com.mercado.domain.dto.response.CategoriaResponse;
import br.com.mercado.domain.model.Categoria;
import br.com.mercado.domain.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

        @Autowired
        CategoriaService categoriaService;

        @GetMapping
        public List<Categoria> getAll() {
                return categoriaService.getAll();
        }

        @PostMapping
        ResponseEntity<CategoriaResponse> create(@RequestBody CategoriaRequest categoriaRequest){
                CategoriaResponse categoriaResponse = categoriaService.create(categoriaRequest);
                return ResponseEntity.status(201).body(categoriaResponse);
        }
}


