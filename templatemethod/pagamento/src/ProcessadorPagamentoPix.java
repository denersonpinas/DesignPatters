public class ProcessadorPagamentoPix extends ProcessadorPagamento {
    @Override
    protected void debitar() {
        System.out.println(
            "DEBITANDO NO PIX..."
        );
    }
}
