
package com.sistemadeevento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ParticipanteTest {

    // ==========================================
    // 1. TESTES DO CONSTRUTOR
    // ==========================================

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