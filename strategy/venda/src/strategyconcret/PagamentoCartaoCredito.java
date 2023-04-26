package strategyconcret;
import strategyinterface.StrategyPagamento;

public class PagamentoCartaoCredito implements StrategyPagamento {

    @Override
    public void pagar(Double value) {
        System.out.println(
            "PAGOU NO:  CRÉDITO \n" +
            "   VALOR:  " + (value + (value * .10)) 
        );
    }
    
}