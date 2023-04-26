public class ProcessadorPagamentoDebito extends ProcessadorPagamento {

    @Override
    protected void debitar() {
        System.out.println(
            "DEBITANDO NO DEBITO..."
        );
    }
    
}
