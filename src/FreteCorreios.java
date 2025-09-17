
//Classe que implementa de estrategiaFrete e aplica o FreteCorreio
public class FreteCorreios implements EstrategiaFrete {
    @Override
    public double calcularFrete(double peso){
        return  5 + 3 * peso;
    }
}