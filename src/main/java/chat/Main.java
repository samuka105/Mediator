package chat;

public class Main {

    public static void main(String[] args) {
        Mediador sala = new SalaDeChat();

        Participante ana = new Participante("Ana", sala);
        Participante bruno = new Participante("Bruno", sala);
        Participante carla = new Participante("Carla", sala);

        ana.enviar("Bom dia, pessoal");
        bruno.enviar("Bom dia, Ana");

        System.out.println("Caixa da Ana:");
        for (String m : ana.getRecebidas()) {
            System.out.println("  " + m);
        }
        System.out.println("Caixa do Bruno:");
        for (String m : bruno.getRecebidas()) {
            System.out.println("  " + m);
        }
        System.out.println("Caixa da Carla:");
        for (String m : carla.getRecebidas()) {
            System.out.println("  " + m);
        }
    }
}
