package br.com.mercado.domain.controller;

import br.com.mercado.domain.model.Categoria;
import br.com.mercado.domain.model.Mercado;
import br.com.mercado.domain.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
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
}


