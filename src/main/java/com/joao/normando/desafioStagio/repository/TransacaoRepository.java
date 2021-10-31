package com.joao.normando.desafioStagio.repository;

import com.joao.normando.desafioStagio.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Integer> {
}
