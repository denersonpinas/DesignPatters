package strategyconcret;

import strategyinterface.MovimentoStrategy;

public class MovimentoCorrer implements MovimentoStrategy {

    @Override
    public void mover(Integer x, Integer y) {
        // implementação do algoritmo de movimento de correr
        // por exemplo, aumentar a velocidade de movimento e zerar a furtividade
        System.out.println("Estou Correndo...");
    }
    
}
