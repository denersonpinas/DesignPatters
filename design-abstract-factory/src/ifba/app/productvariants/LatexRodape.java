package ifba.app.productvariants;

import ifba.app.ProductRodape;

import ifba.elementos.Rodape;
import ifba.elementos.latex.RodapeLATEX;

public class LatexRodape implements ProductRodape {

    @Override
    public Rodape criaRodape() {
        return new RodapeLATEX();
    }    
}
