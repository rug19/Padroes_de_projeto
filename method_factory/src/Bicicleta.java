
//Classe implementa Transporte com o seu comportamento especifico 
public class Bicicleta implements Transporte {
    @Override
    public void entregar(){
        System.out.println("Entrega feita de bicicleta");
    }
}