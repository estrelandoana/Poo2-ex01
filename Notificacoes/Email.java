public class Email implements Notificacao {
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}