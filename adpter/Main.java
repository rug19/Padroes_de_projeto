public class Main {
    public static void main(String[] args) {
        // Sistema elétrico com tomada de dois pinos
        SistemaEletrico sistema = new SistemaEletrico();
        sistema.conectar("Ventilador");

        System.out.println("\n--- Agora usando uma luminária com tres pinos ---");

        // Criando a tomada de três pinos (incompatível originalmente)
        TomadaTresPinos tomadaTres = new TomadaTresPinos();

        // Criando o adaptador para permitir conexão
        TomadaDoisPinos adaptador = new AdptadorDeTomada(tomadaTres);

        // Conectando a luminária (de três pinos) via adaptador
        adaptador.conectar("Luminaria");
    }
}
