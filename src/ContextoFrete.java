public class ContextoFrete {
    private EstrategiaFrete estrategia;
    public void definirEstrategia(EstrategiaFrete estrategia){
        this.estrategia = estrategia;
    }

    public double calcular(double peso){ 
        return estrategia.calcularFrete(peso);
    }
}