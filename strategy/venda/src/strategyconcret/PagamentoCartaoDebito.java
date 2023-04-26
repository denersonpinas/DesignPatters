package strategyconcret;

import strategyinterface.StrategyPagamento;

public class PagamentoCartaoDebito implements StrategyPagamento {

    @Override
    public void pagar(Double value) {
        System.out.println(
            "PAGOU NO:  DEBITO \n" +
            "   VALOR:  " + (value + (value * .05))
        );
    }
    
}
