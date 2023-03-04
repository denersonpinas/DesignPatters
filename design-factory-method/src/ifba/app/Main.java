package ifba.app;

public class Main {

	private static String configureApplication(TipoDocumento tipo) {
        CriadorDocumento criador;
        Product concreteProduct;

        if (tipo == TipoDocumento.HTML) {
            concreteProduct = new ConcreteHtml();
        } else {
            concreteProduct = new ConcreteMarkdown();
        }
        criador = new CriadorDocumento();		
        return criador.geraDocumentacao(concreteProduct);
    }

	public static void main(String[] args) {

		String app = configureApplication(TipoDocumento.MARKDOWN);        
		System.out.println(app);
	}
}