package com.sistemadeevento;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import  org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** Testes da classe Evento. */
class EventoTest {
    @Test
    void deveRetornarNomeInformadoAoCriarEvento() {
        String nome = "Festival Neon Lights 2026";
        Evento evento = new Evento(
            "musica-01", nome, LocalDateTime.parse("2026-12-05T20:00"),
            "Mineirão",
            new  BigDecimal("120.00")
        );
        assertEquals(nome, evento.getNome());
    }
}
