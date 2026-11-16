
package com.sistemadeevento;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Testes unitários da classe Participante.
 */
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

        assertEquals(
            "jose.silva+evento@email.com",
            participante.getEmail()
        );
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

    participante.setNome("Carlos");

    @Test
    void devePermitirAlterarNomeComSobrenome() {
        Participante participante = new Participante(
            "002", "Maria", "maria@email.com"
        );

@Test
void devePermitirAlterarNomeComSobrenome() {
    Participante participante = new Participante(
        "002", "Maria", "maria@email.com"
    );

    participante.setNome("Maria Silva");

    assertEquals("Maria Silva", participante.getNome());
}   
    @Test
    void devePreservarAcentosNoNomeAoAlterar() {
        Participante participante = new Participante(
            "003", "Joao", "joao@email.com"
        );

    participante.setNome("José Antônio");

    assertEquals("José Antônio", participante.getNome());
}

    @Test
    void naoDevePermitirNomeNulo() {
        Participante participante = new Participante(
            "004", "Maria", "maria@email.com"
        );

    assertThrows(IllegalArgumentException.class, () -> {
        participante.setNome(null);
    });
}

    @Test
    void naoDevePermitirNomeVazio() {
        Participante participante = new Participante(
            "005", "Maria", "maria@email.com"
        );

    assertThrows(IllegalArgumentException.class, () -> {
        participante.setNome("");
    });
}

    @Test
    void naoDevePermitirNomeComApenasEspacos() {
        Participante participante = new Participante(
            "006", "Maria", "maria@email.com"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            participante.setNome("   ");
        });
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

    // ==========================================
    // TESTES DO setEmail()
    // ==========================================

    @Test
    void deveAlterarEmailCorretamente() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        participante.setEmail("novo@email.com");

        assertEquals("novo@email.com", participante.getEmail());
    }

    @Test
    void devePermitirEmailComDominioDiferente() {
        Participante participante = new Participante(
            "002", "Maria", "maria@email.com"
        );

        participante.setEmail("maria@gmail.com");

        assertEquals("maria@gmail.com", participante.getEmail());
    }

    @Test
    void devePreservarCaracteresEspeciaisNoEmailAoAlterar() {
        Participante participante = new Participante(
            "003", "José", "jose@email.com"
        );

        participante.setEmail("jose.silva+evento@email.com");

        assertEquals(
            "jose.silva+evento@email.com",
            participante.getEmail()
        );
    }

    @Test
    void naoDevePermitirEmailNuloNoSet() {
        Participante participante = new Participante(
            "004", "Ana", "ana@email.com"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            participante.setEmail(null);
        });
    }

    @Test
    void naoDevePermitirEmailVazioNoSet() {
        Participante participante = new Participante(
            "005", "Carlos", "carlos@email.com"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            participante.setEmail("");
        });
    }

    @Test
    void naoDevePermitirEmailComEspacosNoSet() {
        Participante participante = new Participante(
            "006", "Pedro", "pedro@email.com"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            participante.setEmail("   ");
        });
    }

    @Test
    void naoDevePermitirEmailSemArrobaNoSet() {
        Participante participante = new Participante(
            "007", "Lucas", "lucas@email.com"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            participante.setEmail("lucasemail.com");
        });
    }


    @Test
    void deveAtualizarTodosOsDadosDoParticipante() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        participante.atualizarDados(
            "002", "Carlos", "carlos@email.com"
        );

    participante.atualizarDados(
        "002", "Carlos", "carlos@email.com"
    );

    @Test
    void devePermitirAtualizarDadosComNomeCompleto() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        participante.atualizarDados(
            "002", "Carlos Eduardo Silva", "carlos@email.com"
        );

    participante.atualizarDados(
        "002", "Carlos Eduardo Silva", "carlos@email.com"
    );

    @Test
    void naoDeveAtualizarDadosComCodigoNulo() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            participante.atualizarDados(
                null, "Carlos", "carlos@email.com"
            );
        });
    }

    @Test
    void naoDeveAtualizarDadosComNomeNulo() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            participante.atualizarDados(
                "002", null, "carlos@email.com"
            );
        });
    }

    @Test
    void naoDeveAtualizarDadosComEmailInvalido() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            participante.atualizarDados(
                "002", "Carlos", "emailinvalido"
            );
        });
    }

    @Test
    void naoDeveAlterarNenhumDadoQuandoAtualizacaoForInvalida() {
        Participante participante = new Participante(
            "001", "João", "joao@email.com"
        );

        assertThrows(IllegalArgumentException.class, () -> {
            participante.atualizarDados(
                "002", "Carlos", "emailinvalido"
            );
        });

        assertEquals("001", participante.getCodigo());
        assertEquals("João", participante.getNome());
        assertEquals("joao@email.com", participante.getEmail());
    }
}

}

