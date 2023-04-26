public class Cliente {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();
        Investidor investidor = new Investidor();

        ServidorCotacao servidorCotacao = new ServidorCotacao();

        servidorCotacao.registerObserver(investidor);
        servidorCotacao.registerObserver(banco);

        servidorCotacao.novaCotacao( new Cotacao("BRL", 3));
        servidorCotacao.novaCotacao( new Cotacao("USD", 4));
    }
}
