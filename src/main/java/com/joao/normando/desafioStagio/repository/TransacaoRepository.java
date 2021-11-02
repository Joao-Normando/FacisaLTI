package com.joao.normando.desafioStagio.repository;

import com.joao.normando.desafioStagio.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Integer> {

    @Query(value = "SELECT * FROM transacao where id_conta = ?", nativeQuery=true)
    public List<Transacao> findByConta(Integer idConta);
}
