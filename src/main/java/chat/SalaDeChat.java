package chat;

import java.util.ArrayList;
import java.util.List;

public class SalaDeChat implements Mediador {

    private List<Participante> participantes = new ArrayList<Participante>();

    public void adicionar(Participante participante) {
        participantes.add(participante);
    }

    public void enviar(String mensagem, Participante remetente) {
        for (Participante p : participantes) {
            if (p != remetente) {
                p.receber(mensagem, remetente);
            }
        }
    }
}
