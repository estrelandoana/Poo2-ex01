import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new Email());
        notificacoes.add(new SMS());

        for (Notificacao n : notificacoes) {
            n.enviarMensagem("Nova notificação!");
        }
    }
}