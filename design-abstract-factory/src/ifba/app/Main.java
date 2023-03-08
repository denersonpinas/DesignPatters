package ifba.app;

public class Main {

	public static void main(String[] args) {
		CriadorDocumento criador = new CriadorDocumento(new FactoryHtml());
		System.out.println(criador.geraDocumentacao());
	}

}
