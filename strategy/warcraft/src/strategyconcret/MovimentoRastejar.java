package strategyconcret;

import strategyinterface.MovimentoStrategy;

public class MovimentoRastejar implements MovimentoStrategy {

    @Override
    public void mover(Integer x, Integer y) {
        // implementação do algoritmo de movimento de rastejo
        // por exemplo, diminuir a velocidade de movimento e aumentar a furtividade
        System.out.println("Estou rastejando...");
    }
    
}
