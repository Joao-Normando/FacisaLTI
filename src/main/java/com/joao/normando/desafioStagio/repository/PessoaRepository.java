package com.joao.normando.desafioStagio.repository;

import com.joao.normando.desafioStagio.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PessoaRepository extends JpaRepository <Pessoa, Integer> {
}
