package ifba.app;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;
import ifba.elementos.html.CabecalhoHTML;
import ifba.elementos.html.CorpoHTML;
import ifba.elementos.html.RodapeHTML;

public class ConcreteHtml implements Product {
    @Override
    public Cabecalho criaCabecalho() {
        return new CabecalhoHTML();
    }

    @Override
    public Corpo criaCorpo() {
        return new CorpoHTML();
    }

    @Override
    public Rodape criaRodape() {
        return new RodapeHTML();
    }    
}