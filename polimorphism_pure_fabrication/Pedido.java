// Pedido.java
public class Pedido {
    private String id;
    private String status;
    private String clienteEmail;
    private String clienteTelefone;

    public Pedido(String id, String email, String telefone) {
        this.id = id;
        this.status = "PENDENTE";
        this.clienteEmail = email;
        this.clienteTelefone = telefone;
    }

    public String getId() { return id; }
    public String getStatus() { return status; }
    public String getClienteEmail() { return clienteEmail; }
    public String getClienteTelefone() { return clienteTelefone; }

    public void setStatus(String status) {
        this.status = status;
    }
}
