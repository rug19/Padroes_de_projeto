public class SistemaEletrico implements TomadaDoisPinos{
    @Override
    public void conectar(String aparelho){
        System.out.println("Conectando " + aparelho + " usuando a tomada de dois pinos");

    }

}