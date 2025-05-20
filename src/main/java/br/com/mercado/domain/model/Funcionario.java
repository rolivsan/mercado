package br.com.mercado.domain.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "funcionarios")
@Builder
@Data
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cargo;
    private Double salario;
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "mercado_id", nullable = false)
    private Mercado mercado;

}

