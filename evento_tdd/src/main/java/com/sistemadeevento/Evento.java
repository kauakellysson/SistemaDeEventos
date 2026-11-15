package com.sistemadeevento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/** Representa um evento do sistema. */
public final class Evento {

    private final String nome;
    private final String codigo;
    private BigDecimal preco;

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
        this.codigo = codigo;
        this.preco = preco;
    }

    /**
     * Retorna o nome do evento.
     * @return nome informado na criação
     */
    public String getNome() {
        return nome;
    }

    /**
    * Retorna o código do evento.
    * @return código informado na criação
    */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Retorna o preço do evento.
     * @return preço do evento
     */
    public BigDecimal getPreco() {
        return preco;
    }
}
