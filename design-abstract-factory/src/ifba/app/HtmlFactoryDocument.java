package ifba.app;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;
import ifba.app.productvariants.HtmlCabecalho;
import ifba.app.productvariants.HtmlCorpo;
import ifba.app.productvariants.HtmlRodape;

public class HtmlFactoryDocument implements FactoryDocument{

    @Override
    public Cabecalho criaCabecalho() {
        return new HtmlCabecalho();
    }

    @Override
    public Corpo criaCorpo() {
        return new HtmlCorpo();
    }

    @Override
    public Rodape criaRodape() {
        return new HtmlRodape();
    }    
}