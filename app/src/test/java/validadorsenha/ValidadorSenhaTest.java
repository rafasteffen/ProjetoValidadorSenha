package validadorsenha;

import org.junit.jupiter.api.Test;

import validadorsenha.ValidadorSenha;

import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTest {

    @Test
    void senhaComSeteCaracteresEhInvalida() {
        var validador = new ValidadorSenha();

        assertFalse(validador.validar("Abcde12"));
    }

    @Test
    void senhaComOitoCaracteresEhValida() {

    var validador = new ValidadorSenha();

    boolean resultado = validador.validar("Abcdef12");

    assertTrue(resultado);
    }
    @Test
    void senhaNulaEhInvalida() {

        var validador = new ValidadorSenha();

        boolean resultado = validador.validar(null);

        assertFalse(resultado);
    }

        @Test
    void senhaSemDigitoEhInvalida() {

        var validador = new ValidadorSenha();

        boolean resultado = validador.validar("Abcdefgh");

        assertFalse(resultado);
    }

    @Test
    void senhaSemMaiusculaEhInvalida() {

        var validador = new ValidadorSenha();

        boolean resultado = validador.validar("abcdef12");

        assertFalse(resultado);
    }

    @Test
    void senhaComMaisDeOitoCaracteresEhValida() {

    var validador = new ValidadorSenha();

    boolean resultado = validador.validar("Senha123");

    assertTrue(resultado);
}
}