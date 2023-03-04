package ifba.app.productvariants;

import ifba.app.ProductCabecalho;

import ifba.elementos.Cabecalho;
import ifba.elementos.latex.CabecalhoLATEX;

public class LatexCabecalho implements ProductCabecalho {

    @Override
    public Cabecalho criaCabecalho() {
        return new CabecalhoLATEX();
    }    
}
