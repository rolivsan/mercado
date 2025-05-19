package br.com.mercado.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "mercados")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Mercado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;
    private String cnpj;

    @OneToMany(mappedBy = "mercado", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Fornecedor> fornecedores;

    @OneToMany(mappedBy = "mercado", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Funcionario> funcionarios;

}

