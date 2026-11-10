package chat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalaDeChatTest {

    @Test
    public void testRemetenteNaoRecebeAPropriaMensagem() {
        Mediador sala = new SalaDeChat();
        Participante ana = new Participante("Ana", sala);
        new Participante("Bruno", sala);

        ana.enviar("oi");

        assertTrue(ana.getRecebidas().isEmpty());
    }

    @Test
    public void testOutroParticipanteRecebe() {
        Mediador sala = new SalaDeChat();
        Participante ana = new Participante("Ana", sala);
        Participante bruno = new Participante("Bruno", sala);

        ana.enviar("oi");

        assertEquals(1, bruno.getRecebidas().size());
        assertEquals("Ana: oi", bruno.getRecebidas().get(0));
    }

    @Test
    public void testTodosMenosRemetenteRecebem() {
        Mediador sala = new SalaDeChat();
        Participante ana = new Participante("Ana", sala);
        Participante bruno = new Participante("Bruno", sala);
        Participante carla = new Participante("Carla", sala);

        ana.enviar("bom dia");

        assertEquals(1, bruno.getRecebidas().size());
        assertEquals(1, carla.getRecebidas().size());
        assertTrue(ana.getRecebidas().isEmpty());
    }

    @Test
    public void testVariasMensagensMantemOrdem() {
        Mediador sala = new SalaDeChat();
        Participante ana = new Participante("Ana", sala);
        Participante bruno = new Participante("Bruno", sala);

        ana.enviar("primeira");
        bruno.enviar("resposta");
        ana.enviar("segunda");

        assertEquals("Ana: primeira", bruno.getRecebidas().get(0));
        assertEquals("Ana: segunda", bruno.getRecebidas().get(1));
        assertEquals("Bruno: resposta", ana.getRecebidas().get(0));
    }
}
