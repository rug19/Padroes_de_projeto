public abstract class TransporteFactory {
    //Factory Method
    public abstract Transporte criarTransporte();

    //Metodo de negocio que usa o produto criado
    public void entregarPedido(){
        Transporte t = criarTransporte();
        t.entregar();
    }
}