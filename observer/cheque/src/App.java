public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();

        Conta conta = new Conta(3000, "1234");
        Conta conta2 = new Conta(30, "1235");
        Conta conta3 = new Conta(1500, "1236");

        ServidorBanco servidorBanco = new ServidorBanco();
        servidorBanco.registerObserver(banco);
        servidorBanco.registerConta(conta);
        servidorBanco.registerConta(conta2);
        servidorBanco.registerConta(conta3);

        servidorBanco.novoCheque(new CaixaEletronico(1000, conta));
        servidorBanco.novoCheque(new CaixaEletronico(10, conta2));
        servidorBanco.novoCheque(new CaixaEletronico(1000, conta2));
        servidorBanco.novoCheque(new CaixaEletronico(3000, conta2));
        servidorBanco.novoCheque(new CaixaEletronico(1000, conta3));

        banco.printRecebimento();
    }
}
