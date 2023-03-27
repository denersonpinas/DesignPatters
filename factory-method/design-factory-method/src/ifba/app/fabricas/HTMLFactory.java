package ifba.app.fabricas;

import ifba.elementos.ICabecalho;
import ifba.elementos.ICorpo;
import ifba.elementos.IDocuments;
import ifba.elementos.IRodape;
import ifba.elementos.html.HTMLDocuments;

/**
 * HTMLFactory
 */
public class HTMLFactory implements FactoryDocuments {

    @Override
    public IDocuments geraDocumentacao(ICabecalho iCabecalho, ICorpo iCorpo, IRodape iRodape) {
        return new HTMLDocuments(iCabecalho, iCorpo, iRodape);
    }    
}