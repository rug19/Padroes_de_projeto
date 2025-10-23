// ServicoNotificacao.java
public class ServicoNotificacao {

    public void notificar(String destinatario, String mensagem, Notificacao tipoNotificacao) {
        System.out.println("\n[ServicoNotificacao] Iniciando rotina de envio...");
        // Polimorfismo: não importa se é Email, SMS ou WhatsApp
        tipoNotificacao.enviar(destinatario, mensagem);
        System.out.println("[ServicoNotificacao] Envio concluIdo.");
    }
}
