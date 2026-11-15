package com.sistemadeevento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testes da classe Participante.
 */
class ParticipanteTest {

    @Test
    void deveCriarParticipanteComDadosValidos() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        assertEquals("001", participante.getCodigo());
        assertEquals("João", participante.getNome());
        assertEquals("joao@email.com", participante.getEmail());
    }
}
