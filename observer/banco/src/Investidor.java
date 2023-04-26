public class Investidor implements Observer {

    @Override
    public void notify(Cotacao cotacao) {
        // TODO Auto-generated method stub
        System.out.println("INVESTIDOR: \n" +
            "   MOEDA: " + cotacao.getMoeda() + "\n" +
            "   VALOR: " + cotacao.getValue() + "\n"
        );
    }
    
}
