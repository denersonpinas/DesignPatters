package strategyconcret;

import strategyinterface.StrategyPagamento;

public class PagamentoPix implements StrategyPagamento {

    @Override
    public void pagar(Double value) {
        System.out.println(
            "PAGOU NO:  PIX \n" +
            "   VALOR:  " + (value - (value * .05))
        );
    }
    
}
