package ifba.app;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;

public interface Product {
    Cabecalho criaCabecalho();
    Corpo criaCorpo();
    Rodape criaRodape();
}