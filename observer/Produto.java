
import java.util.ArrayList;
import java.util.List;

public class Produto implements Subject {
    private String nome;
    private double preco;
    private int estoque;
    private  List<Observer> observers;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
        this.observers = new ArrayList<>();
    }

    @Override
    public void adicionarObserver(Observer observer){
        observers.add(observer);
        System.out.println("Novo cliente inscrito para noticacoes do produto" + nome + ".");
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
        System.out.println("Cliente removido das notificacoes do produto" + nome + ".");
    }

    @Override
    public void notificarObservers(String mensagem){
        for (Observer observer : observers){
            observer.atualizar(mensagem);
        }
    }

    public void setPreco(double preco){
        this.preco = preco;
        notificarObservers("O preco do produto" + nome + " foi alterado para R$ " + preco);
    }

    public void adicionarEstoque(int estoque){
        notificarObservers("Novo estoque do produto " + nome + " disponivel " + estoque + " unidades ");
    }
}