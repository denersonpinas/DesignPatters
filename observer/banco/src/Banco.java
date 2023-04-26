public class Banco implements Observer {

    @Override
    public void notify(Cotacao cotacao) {
        System.out.println("Banco: \n" +
            "   MOEDA: " + cotacao.getMoeda() + "\n" +
            "   VALOR: " + cotacao.getValue() + "\n"
        );
    }
    
}
