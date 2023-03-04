package ifba.app;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;

import ifba.app.productvariants.LatexCabecalho;
import ifba.app.productvariants.LatexCorpo;
import ifba.app.productvariants.LatexRodape;

public class LatexFactoryDocument implements FactoryDocument {

    @Override
    public Cabecalho criaCabecalho() {
        return new LatexCabecalho();
    }

    @Override
    public Corpo criaCorpo() {
        return new LatexCorpo();
    }

    @Override
    public Rodape criaRodape() {
        return new LatexRodape();
    }    
}
