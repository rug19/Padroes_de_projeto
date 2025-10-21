import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<ItemVenda> itens;

    public Venda() {
        this.itens = new ArrayList<>();
    }

    // Creator: a Venda cria e armazena seus ItemVenda
    public ItemVenda criarItemVenda(Produto produto, int quantidade) {
        ItemVenda novoItem = new ItemVenda(produto, quantidade);
        itens.add(novoItem);
        return novoItem;
    }

    // Information Expert: a Venda sabe calcular o total geral
    public double calcularTotal() {
        double total = 0.0;
        for (ItemVenda item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
}
