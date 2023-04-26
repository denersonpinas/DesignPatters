public class ProcessadorPagamentoCredito extends ProcessadorPagamento {

    @Override
    protected void debitar() {
        System.out.println(
            "DEBITANDO NO CRÉDITO..."
        );
    }
    
}
