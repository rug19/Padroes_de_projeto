public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook Dell", 3500.00);

        //Cria o cliente
        Cliente cliente1 = new Cliente("Ruan");

        //Adiciona cliente como observers
        produto.adicionarObserver(cliente1);

        System.out.println("\n--- Alterando o preco do produto ---");
        produto.setPreco(3200.00);

        System.out.println("\n --- Alterando o estoque do produto ---");
        produto.adicionarEstoque(2);



    }
}