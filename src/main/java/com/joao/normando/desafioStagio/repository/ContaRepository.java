package com.joao.normando.desafioStagio.repository;

import com.joao.normando.desafioStagio.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository <Conta, Integer> {


}
