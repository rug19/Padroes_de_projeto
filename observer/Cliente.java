public class Cliente implements  Observer {
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem){
        System.out.println("Ola, " + nome + " Voce recebeu uma notificacao: " + mensagem);
    }
}