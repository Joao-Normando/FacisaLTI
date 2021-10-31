package com.joao.normando.desafioStagio.model;

import lombok.Getter;
import lombok.Setter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "Conta")
@EnableSwagger2
public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConta;

    @Column(name = "saldo")
    private Double saldo;

    @Column(name = "limiteSaqueDiario")
    private Double limiteSaqueDiario;

    @Column(name = "flagAtivo")
    private Boolean flagAtivo;

    @Column(name = "tipoConta")
    private Integer tipoConta;

    @Column(name = "dataCriacao")
    private LocalDateTime dataCriacao;


    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa idPessoa;


}
