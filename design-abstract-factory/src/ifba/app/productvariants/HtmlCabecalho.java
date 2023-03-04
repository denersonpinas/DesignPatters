package ifba.app.productvariants;

import ifba.app.ProductCabecalho;

import ifba.elementos.Cabecalho;
import ifba.elementos.html.CabecalhoHTML;

public class HtmlCabecalho implements ProductCabecalho {

    @Override
    public Cabecalho criaCabecalho() {
        return new CabecalhoHTML();
    }    
}
