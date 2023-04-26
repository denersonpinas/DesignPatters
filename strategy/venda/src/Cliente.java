import strategyconcret.PagamentoCartaoCredito;
import strategyconcret.PagamentoCartaoDebito;
import strategyconcret.PagamentoPix;

public class Cliente {
    public static void main(String[] args) throws Exception {
        ContextCompra contextCompra = new ContextCompra(5000.0);

        contextCompra.processarCompra( new PagamentoCartaoCredito());
        contextCompra.processarCompra( new PagamentoCartaoDebito());
        contextCompra.processarCompra( new PagamentoPix());
    }
}
