package chat;

import java.util.ArrayList;
import java.util.List;

public class Participante {

    private String nome;
    private Mediador mediador;
    private List<String> recebidas = new ArrayList<String>();

    public Participante(String nome, Mediador mediador) {
        this.nome = nome;
        this.mediador = mediador;
        this.mediador.adicionar(this);
    }

    public String getNome() {
        return nome;
    }

    public void enviar(String mensagem) {
        mediador.enviar(mensagem, this);
    }

    public void receber(String mensagem, Participante remetente) {
        recebidas.add(remetente.getNome() + ": " + mensagem);
    }

    public List<String> getRecebidas() {
        return recebidas;
    }
}
