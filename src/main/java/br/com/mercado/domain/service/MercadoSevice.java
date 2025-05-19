package br.com.mercado.domain.service;

import br.com.mercado.domain.dto.request.MercadoRequest;
import br.com.mercado.domain.model.Mercado;
import br.com.mercado.domain.useCase.MercadoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MercadoSevice {

    @Autowired
    MercadoUseCase mercadoUseCase;

    public List<Mercado> getAll() {
        return mercadoUseCase.getAll();
    }

    public void create(MercadoRequest mercadoRequest) {
        mercadoUseCase.create(mercadoRequest);
    }
}
