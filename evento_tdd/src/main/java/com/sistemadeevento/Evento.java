package com.sistemadeevento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/** Representa um evento do sistema. */
public final class Evento {

    private final String nome;

    /**
     * Cria um evento com os dados informados.
     * @param codigo código do evento
     * @param nomeInformado nome do evento
     * @param data data e horário do evento
     * @param local local do evento
     * @param preco preço do evento
     */
    public Evento(String codigo, String nomeInformado, LocalDateTime data,
                  String local, BigDecimal preco) {
        this.nome = nomeInformado;
    }

    /**
     * Retorna o nome do evento.
     * @return nome informado na criação
     */
    public String getNome() {
        return nome;
    }
}
