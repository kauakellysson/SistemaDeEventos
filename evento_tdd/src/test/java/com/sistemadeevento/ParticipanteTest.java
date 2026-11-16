package com.sistemadeevento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Testes da classe Participante.
 */
class ParticipanteTest {

    @Test
    void deveCriarParticipanteComDadosValidos() {
        assertDoesNotThrow(() ->
            new Participante(
                "P001",
                "Ana",
                "ana@email.com"
            )
        );
    }
}

