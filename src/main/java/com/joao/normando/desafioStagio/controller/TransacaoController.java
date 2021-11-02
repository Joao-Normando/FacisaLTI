package com.joao.normando.desafioStagio.controller;

import com.joao.normando.desafioStagio.model.Transacao;
import com.joao.normando.desafioStagio.service.TransacaoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/transacao")
public class TransacaoController {

    @Autowired
    TransacaoService transacaoService;

    @GetMapping("/listar")
    @ApiOperation(value = "Retorna uma lista de transacao")
    public List<Transacao> getAllTransacoes() {
        return transacaoService.listar();
    }

    @PostMapping("/adiciona")
    @ApiOperation(value = "Adiciona uma transacao")
    public void saveTransacao(@PathVariable Transacao transacao) {
        transacaoService.salvar(transacao);
    }

    @GetMapping("/exibe_extrato/{id}")
    @ApiOperation(value="Retorna extrato por id")
    private List<Transacao> getExtratoById(@PathVariable("idConta") Integer idConta) {
        return transacaoService.recuperaExtrato(idConta);
    }
}
