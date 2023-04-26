

import java.util.ArrayList;
import java.util.List;

public class ServidorBanco implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<Conta> contas = new ArrayList<>();

    public void novoCheque( CaixaEletronico caixaEletronico ) {
        if(contas.contains(caixaEletronico.getConta())) {
            Conta verifySaldo = contas.get(contas.indexOf(caixaEletronico.getConta()));

            if(verifySaldo.getSaldo() < caixaEletronico.getValor()) {
                notifyObservers(caixaEletronico);
            }
        }
    }

    public void registerConta(Conta conta) {
        contas.add(conta);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers( CaixaEletronico chequeNovo ) {
        observers.forEach(observer -> observer.notify(chequeNovo));
    }
}
