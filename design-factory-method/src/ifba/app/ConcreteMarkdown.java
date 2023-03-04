package ifba.app;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;
import ifba.elementos.markdown.CabecalhoMarkdown;
import ifba.elementos.markdown.CorpoMarkdown;
import ifba.elementos.markdown.RodapeMarkdown;

public class ConcreteMarkdown implements Product {
    @Override
    public Cabecalho criaCabecalho() {
        return new CabecalhoMarkdown();
    }

    @Override
    public Corpo criaCorpo() {
        return new CorpoMarkdown();
    }

    @Override
    public Rodape criaRodape() {
        return new RodapeMarkdown();
    }    
}