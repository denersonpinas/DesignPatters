import java.util.ArrayList;
import java.util.List;

public class Banco implements Observer {
    private List<CaixaEletronico> cheques = new ArrayList<>();

    @Override
    public void notify(CaixaEletronico newCheques) {
        cheques.add(newCheques);
    }

    @Override
    public void printRecebimento() {
        cheques.forEach(cheque -> 
            System.out.println("Cheques: \n" +
                "   CONTA: \n" +
                "       N° CONTA: " + cheque.getConta().getConta() + "\n" +
                "       SALDO: " + cheque.getConta().getSaldo() + "\n" +
                "       VALOR: " + cheque.getValor() + "\n"
            )
        );
    }

}
