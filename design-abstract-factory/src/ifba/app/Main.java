package ifba.app;

public class Main {

	private static CriadorDocumento configureApplication() {
        CriadorDocumento criador;
        FactoryDocument factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("html")) {
            factory = new HtmlFactoryDocument();
        } else {
            factory = new LatexFactoryDocument();
        }
        criador = new CriadorDocumento(factory);
        return criador;
    }

    public static void main(String[] args) {
        CriadorDocumento app = configureApplication();
        app.geraDocumentacao();
    }
}
