public class ItemVenda {
    private int quantidade;
    private Produto produto;


    public ItemVenda(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal(){
        return produto.getPrecoUnitario() * quantidade;
    }

    public String getDescricao(){
        return quantidade + " x " + produto.getNome();
    }
}