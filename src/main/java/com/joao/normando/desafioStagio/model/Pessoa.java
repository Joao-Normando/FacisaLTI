package com.joao.normando.desafioStagio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name= "Pessoa")
public class Pessoa implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPessoa")
    private Integer idPessoa;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "dataNascimento")
    private LocalDateTime dataNascimento;


}
