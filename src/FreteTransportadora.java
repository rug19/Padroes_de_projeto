public class FreteTransportadora implements EstrategiaFrete {
    @Override
    public double calcularFrete(double peso) {
        return 10 + 2 * peso;
    }
}