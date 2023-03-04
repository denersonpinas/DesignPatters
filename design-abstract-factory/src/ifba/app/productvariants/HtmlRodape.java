package ifba.app.productvariants;

import ifba.app.ProductRodape;

import ifba.elementos.Rodape;
import ifba.elementos.html.RodapeHTML;

public class HtmlRodape implements ProductRodape {

    @Override
    public Rodape criaRodape() {
        return new RodapeHTML();
    }
    
}
