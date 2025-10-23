// Main.java
public class Main {
    public static void main(String[] args) {
        // Pedido 1
        Pedido pedido = new Pedido("P1234", "cliente@email.com", "5511987654321");

        // Serviço "inventado" (Pure Fabrication)
        ServicoNotificacao notificador = new ServicoNotificacao();

        String mensagem = "Seu pedido " + pedido.getId() + " foi ATUALIZADO.";

        // 1) Email
        Notificacao email = new NotificacaoEmail();
        pedido.setStatus("EM SEPARACAO");
        notificador.notificar(
                pedido.getClienteEmail(),
                mensagem + " Novo Status: " + pedido.getStatus(),
                email
        );

        // 2) SMS
        Notificacao sms = new NotificacaoSms();
        pedido.setStatus("ENTREGUE");
        notificador.notificar(
                pedido.getClienteTelefone(),
                mensagem + " Novo Status: " + pedido.getStatus(),
                sms
        );

        // 3) WhatsApp (novo tipo) com novo pedido (pedido2)
        Pedido pedido2 = new Pedido("P5678", "cliente2@empresa.com", "5521999998888");
        Notificacao whatsapp = new NotificacaoWhatsApp();
        pedido2.setStatus("CANCELADO");
        notificador.notificar(
                pedido2.getClienteTelefone(),
                "Seu pedido " + pedido2.getId() + " foi " + pedido2.getStatus() + ".",
                whatsapp
        );
    }
}
