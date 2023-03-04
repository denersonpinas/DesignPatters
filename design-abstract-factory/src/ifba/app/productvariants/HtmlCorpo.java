package ifba.app.productvariants;

import ifba.app.ProductCorpo;

import ifba.elementos.Corpo;
import ifba.elementos.html.CorpoHTML;

public class HtmlCorpo implements ProductCorpo {

    @Override
    public Corpo criaCorpo() {
        return new CorpoHTML();
    }
    
}
