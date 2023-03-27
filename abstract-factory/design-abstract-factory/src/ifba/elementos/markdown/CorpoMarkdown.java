package ifba.elementos.markdown;

import ifba.elementos.Corpo;

public class CorpoMarkdown implements Corpo {
	String texto;

	@Override
	public String getOutput() {
		return getTexto() + "\n\n";
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
