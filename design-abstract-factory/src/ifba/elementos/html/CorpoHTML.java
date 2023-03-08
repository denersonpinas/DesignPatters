package ifba.elementos.html;

import ifba.elementos.Corpo;

public class CorpoHTML implements Corpo {
	String texto;

	@Override
	public String getOutput() {
		return "<p>" + getTexto() + "</p>";
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
