public class AdptadorDeTomada implements TomadaDoisPinos {
    private TomadaTresPinos tomadaTresPinos;

    public AdptadorDeTomada(TomadaTresPinos tomadaTresPinos){
        this.tomadaTresPinos = tomadaTresPinos;
    }

    @Override
    public void conectar(String aparelho){
        tomadaTresPinos.plugar(aparelho);
    }
    
}