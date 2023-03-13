package ifba.app;

import ifba.elementos.IDocuments;
import ifba.elementos.html.HTMLDocuments;
import ifba.elementos.markdown.MarkdownDocuments;

public class Main {

	private static String configureApplication(TipoDocumento tipo) {
        CriaDocumentos criador;
        IDocuments concreteProduct;

        if (tipo == TipoDocumento.HTML) {
            concreteProduct = new HTMLDocuments();
        } else {
            concreteProduct = new MarkdownDocuments();
        }
        criador = new CriaDocumentos();		
        return criador.geraDocumentacao(concreteProduct);
    }

	public static void main(String[] args) {

		String app = configureApplication(TipoDocumento.MARKDOWN);        
		System.out.println(app);
	}
}