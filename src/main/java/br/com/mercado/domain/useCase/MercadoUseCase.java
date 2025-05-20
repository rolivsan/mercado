package br.com.mercado.domain.useCase;

import br.com.mercado.domain.dto.request.MercadoRequest;
import br.com.mercado.domain.mapper.MercadoMapper;
import br.com.mercado.domain.model.Fornecedor;
import br.com.mercado.domain.model.Mercado;
import br.com.mercado.domain.repository.MercadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class MercadoUseCase {

    @Autowired
    MercadoRepository mercadoRepository;

    public List<Mercado> getAll() {
        return mercadoRepository.findAll();
    }

    public void create(MercadoRequest mercadoRequest) throws Exception {
        for (Mercado mer : mercadoRepository.findAll()) {
            if (mer.getCnpj().equalsIgnoreCase(mercadoRequest.getCnpj())) {
                throw new Exception("mercado ja existe");
            }
        }
        Mercado entity = MercadoMapper.toEntity(mercadoRequest);
        mercadoRepository.save(entity);
    }
}
