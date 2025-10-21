public class Main {
    public static void main(String[] args) {
        // Produtos disponíveis
        Produto cafe = new Produto("Café Expresso", 5.00);
        Produto bolo = new Produto("Fatia de Bolo", 12.50);

        // ----- Primeira Venda -----
        Venda venda1 = new Venda();
        venda1.criarItemVenda(cafe, 2);   // 2 x 5,00
        venda1.criarItemVenda(bolo, 1);   // 1 x 12,50
        double total1 = venda1.calcularTotal();

        System.out.println("--- Venda 1 ---");
        System.out.println("Total: R$ " + total1);

        // ----- Segunda Venda -----
        Venda venda2 = new Venda();
        venda2.criarItemVenda(bolo, 2);   // 2 x 12,50
        venda2.criarItemVenda(cafe, 3);   // 3 x 5,00
        double total2 = venda2.calcularTotal();

        System.out.println("\n--- Venda 2 ---");
        System.out.println("Total: R$ " + total2);
    }
}
