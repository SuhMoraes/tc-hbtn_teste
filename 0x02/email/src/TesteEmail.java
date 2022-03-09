import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteEmail {

    @Test
    void testar_email_com_arroba() {
        boolean email = Pessoa.emailValid("email_teste@dominio.com.br");
        assertTrue(email);
    }

    @Test
    void testar_email_sem_arroba() {
        boolean email = Pessoa.emailValid("email_testedominio.com.br");
        assertTrue(email);
    }

    @Test
    void testar_email_mais_50_caracteres() {
        boolean email = Pessoa.emailValid("emailtestemuitolongonaodeveser_valido@dominio.com.br");
        assertEquals(email, false);
    }
}
