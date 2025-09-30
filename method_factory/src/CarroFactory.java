

public class CarroFactory extends TransporteFactory {
    @Override
    public Transporte criarTransporte(){
        return new Carro();
    }
}