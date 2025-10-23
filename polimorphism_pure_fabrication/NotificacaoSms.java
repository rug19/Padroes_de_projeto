// NotificacaoSms.java
public class NotificacaoSms implements Notificacao {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println(">>> [SMS] Enviando para: " + destinatario);
        String resumida = mensagem.length() > 50 ? mensagem.substring(0, 50) + "..." : mensagem;
        System.out.println("Mensagem: " + resumida);
    }
}
