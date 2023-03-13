package ifba.app;

import ifba.elementos.IDocuments;

public interface AbstractFactory {
    String geraDocumentacao( IDocuments iDocuments );
}
