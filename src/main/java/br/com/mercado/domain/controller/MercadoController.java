package br.com.mercado.domain.controller;

import br.com.mercado.domain.dto.request.MercadoRequest;
import br.com.mercado.domain.model.Mercado;
import br.com.mercado.domain.service.MercadoSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mercado")
public class MercadoController {

    @Autowired
    MercadoSevice mercadoSevice;

    @GetMapping
    public ResponseEntity<List<Mercado>> getAll() {
        return ResponseEntity.ok(mercadoSevice.getAll());
    }

    @PostMapping
    ResponseEntity<Void> create(@RequestBody MercadoRequest mercadoRequest) throws Exception{
        mercadoSevice.create(mercadoRequest);
        return ResponseEntity.status(201).body(null);
    }

    //TODO Read

    //TODO Update

    //TODO Delete

}
