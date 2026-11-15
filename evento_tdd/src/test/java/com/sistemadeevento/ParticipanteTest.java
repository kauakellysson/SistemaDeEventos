
package com.sistemadeevento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

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

    // ==========================================
    // TESTES DO getNome()
    // ==========================================

    @Test
    void deveRetornarNomeCorretamente() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        assertEquals("João", participante.getNome());
    }

    @Test
    void deveRetornarNomeComSobrenome() {
        Participante participante = new Participante(
            "002", "Maria Silva", "maria@email.com"
        );

        assertEquals("Maria Silva", participante.getNome());
    }

    @Test
    void devePreservarAcentosNoNome() {
        Participante participante = new Participante(
            "003", "José Antônio", "jose@email.com"
        );

        assertEquals("José Antônio", participante.getNome());
    }

    // ==========================================
    // TESTES DO getEmail()
    // ==========================================

    @Test
    void deveRetornarEmailCorretamente() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        assertEquals("joao@email.com", participante.getEmail());
    }

    @Test
    void deveRetornarEmailComDominioDiferente() {
        Participante participante = new Participante(
            "002", "Maria", "maria@gmail.com"
        );

        assertEquals("maria@gmail.com", participante.getEmail());
    }

    @Test
    void devePreservarCaracteresEspeciaisNoEmail() {
        Participante participante = new Participante(
            "003", "José", "jose.silva+evento@email.com"
        );

        assertEquals("jose.silva+evento@email.com", participante.getEmail());
    }
    // ==========================================
// TESTES DO setNome()
// ==========================================

@Test
void deveAlterarNomeCorretamente() {
    Participante participante = new Participante(
        "001", "João", "joao@email.com"
    );

    participante.setNome("Carlos");

    assertEquals("Carlos", participante.getNome());
}

@Test
void devePermitirAlterarNomeComSobrenome() {
    Participante participante = new Participante(
        "002", "Maria", "maria@email.com"
    );

    participante.setNome("Maria Silva");

    assertEquals("Maria Silva", participante.getNome());
}   

    // ==========================================
    // TESTES DO setCodigo()
    // ==========================================

    @Test
    void deveAlterarCodigoCorretamente() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        participante.setCodigo("002");

        assertEquals("002", participante.getCodigo());
    }

    @Test
    void devePermitirCodigoAlfanumericoNoSet() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        participante.setCodigo("ABC123");

        assertEquals("ABC123", participante.getCodigo());
    }

    @Test
    void devePreservarZerosIniciaisNoSetCodigo() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        participante.setCodigo("0002");

        assertEquals("0002", participante.getCodigo());
    }

    @Test
    void naoDevePermitirCodigoNuloNoSet() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            participante.setCodigo(null);
        });
    }

    @Test
    void naoDevePermitirCodigoVazioNoSet() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            participante.setCodigo("");
        });
    }

    @Test
    void naoDevePermitirCodigoComEspacosNoSet() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            participante.setCodigo("   ");
        });
    }


}

