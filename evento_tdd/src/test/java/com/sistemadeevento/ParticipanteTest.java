
package com.sistemadeevento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParticipanteTest {

    // ==========================================
    // TESTES DO getCodigo()
    // ==========================================

    @Test
    void deveRetornarCodigoCorretamente() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        assertEquals("001", participante.getCodigo());
    }

    @Test
    void deveRetornarCodigoAlfanumerico() {
        Participante participante = new Participante(
            "ABC123", "João", "joao@email.com"
        );

        assertEquals("ABC123", participante.getCodigo());
    }

    @Test
    void devePreservarZerosIniciaisDoCodigo() {
        Participante participante = new Participante(
            "0001", "João", "joao@email.com"
        );

        assertEquals("0001", participante.getCodigo());
    }
}
