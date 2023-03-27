package ifba.app.fabricas;

import ifba.elementos.ICabecalho;
import ifba.elementos.ICorpo;
import ifba.elementos.IDocuments;
import ifba.elementos.IRodape;
import ifba.elementos.markdown.MarkdownDocuments;

public class MarkdownFactory implements FactoryDocuments {

    @Override
    public IDocuments geraDocumentacao(ICabecalho iCabecalho, ICorpo iCorpo, IRodape iRodape) {
        return new MarkdownDocuments(iCabecalho, iCorpo, iRodape);
    }
    
}
