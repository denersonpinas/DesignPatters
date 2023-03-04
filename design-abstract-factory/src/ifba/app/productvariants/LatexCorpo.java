package ifba.app.productvariants;

import ifba.app.ProductCorpo;

import ifba.elementos.Corpo;
import ifba.elementos.latex.CorpoLATEX;

public class LatexCorpo implements ProductCorpo {

    @Override
    public Corpo criaCorpo() {
        return new CorpoLATEX();
    }
    
}
