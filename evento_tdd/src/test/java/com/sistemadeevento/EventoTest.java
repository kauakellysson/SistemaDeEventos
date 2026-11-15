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

    @Test
    void deveManterNomeDoPrimeiroEventoAposCriarOutro() {
        LocalDateTime data = LocalDateTime.parse("2026-12-05T20:00");
        Evento primeiro = new Evento(
            "musica-01", "Festival Neon Lights 2026", data, "Mineirão", BigDecimal.ZERO
        );
        Evento segundo = new Evento(
            "musica-02", "Festival de Jazz", data, "Mineirão", BigDecimal.ZERO
        );

        assertEquals("Festival Neon Lights 2026", primeiro.getNome());
        assertEquals("Festival de Jazz", segundo.getNome());
    }

    @Test
    void deveRetornarNomeComUmCaractere() {
        Evento evento = new Evento(
            "musica-03", "A", LocalDateTime.parse("2026-12-05T20:00"),
            "Mineirão", BigDecimal.ZERO
        );

        assertEquals("A", evento.getNome());
    }

    @Test
    void deveRetornarCodigoInformadoAoCriarEvento() {
        Evento evento = new Evento(
            "musica-01", "Festival Neon Lights 2026",
            LocalDateTime.parse("2026-12-05T20:00"), "Mineirão", BigDecimal.ZERO
        );

        assertEquals("musica-01", evento.getCodigo());
    }

    @Test
    void deveManterCodigosDistintosParaEventosComMesmoNome() {
        LocalDateTime data = LocalDateTime.parse("2026-12-05T20:00");
        Evento primeiro = new Evento(
            "musica-01", "Festival de Jazz", data, "Mineirão", BigDecimal.ZERO
        );
        Evento segundo = new Evento(
            "musica-02", "Festival de Jazz", data, "Mineirão", BigDecimal.ZERO
        );

        assertEquals("musica-01", primeiro.getCodigo());
        assertEquals("musica-02", segundo.getCodigo());
    }

    @Test
    void devePreservarZerosAEsquerdaNoCodigo() {
        Evento evento = new Evento(
            "001", "Festival de Jazz", LocalDateTime.parse("2026-12-05T20:00"),
            "Mineirão", BigDecimal.ZERO
        );

        assertEquals("001", evento.getCodigo());
    }
}
