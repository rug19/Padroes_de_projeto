// NotificacaoWhatsApp.java
public class NotificacaoWhatsApp implements Notificacao {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println(">>> [WHATSAPP] Enviando para (Numero): " + destinatario);
        System.out.println("ConteUdo (Criptografado): " + mensagem);
    }
}
