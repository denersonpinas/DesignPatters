import java.util.ArrayList;
import java.util.List;

public class ServidorCotacao implements Subject {

    private List<Observer> observers = new ArrayList<>();

    public void novaCotacao( Cotacao cotacao ) {
        notifyObservers(cotacao);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers( Cotacao lanceAtual ) {
        observers.forEach(observer -> observer.notify(lanceAtual));
    }
    
}
