package strategyconcret;

import strategyinterface.MovimentoStrategy;

public class MovimentoAndar implements MovimentoStrategy {

    @Override
    public void mover(Integer x, Integer y) {
        // implementação do algoritmo de movimento de andar
        // por exemplo, velocidade normal de movimento e diminuir a furtividade
        System.out.println("Estou andando...");
    }    
}