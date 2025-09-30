import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContextoFrete contexto = new ContextoFrete();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o método de envio:");
        System.out.println("1 - Transportadora");
        System.out.println("2 - Correios");
        System.out.println("3 - Retirada Local");
        int opcao = scanner.nextInt();

        System.out.print("Informe o peso (kg): ");
        double peso = scanner.nextDouble();

        switch (opcao) {
            case 1:
                contexto.definirEstrategia(new FreteTransportadora());
                break;
            case 2:
                contexto.definirEstrategia(new FreteCorreios());
                break;
            case 3:
                contexto.definirEstrategia(new RetiradaLocal());
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        double custo = contexto.calcular(peso);
        System.out.printf("Custo do frete: R$ %.2f\n", custo);
    }
}