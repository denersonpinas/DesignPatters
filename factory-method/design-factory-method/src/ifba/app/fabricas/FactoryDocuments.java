package ifba.app.fabricas;

import ifba.elementos.ICabecalho;
import ifba.elementos.ICorpo;
import ifba.elementos.IDocuments;
import ifba.elementos.IRodape;

public interface FactoryDocuments {
    IDocuments geraDocumentacao( ICabecalho iCabecalho, ICorpo iCorpo, IRodape iRodape );
}