package ifba.app;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;

public interface FactoryAbstract {
    Cabecalho criCabecalho();
    Corpo criaCorpo();
    Rodape criaRodape();
}