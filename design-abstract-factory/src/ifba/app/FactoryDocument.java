package ifba.app;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;

public interface FactoryDocument {
    public abstract Cabecalho criaCabecalho();
    public abstract Corpo criaCorpo();
    public abstract Rodape criaRodape();
}