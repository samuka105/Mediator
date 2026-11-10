package chat;

public interface Mediador {
    void adicionar(Participante participante);
    void enviar(String mensagem, Participante remetente);
}
