package com.joao.normando.desafioStagio.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name= "Transacao")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "idTransacao")
    private Integer idTransacao;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "dataTransacao")
    private LocalDateTime dataTransacao;

    @JoinColumn(name = "id_Conta")
    private Integer idConta;


}
