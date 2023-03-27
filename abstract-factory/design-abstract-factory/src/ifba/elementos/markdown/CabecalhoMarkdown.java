package ifba.elementos.markdown;

import ifba.elementos.Cabecalho;

public class CabecalhoMarkdown implements Cabecalho {
	String titulo;
	String empresa;

	@Override
	public String getOutput() {
		return "# " + getTitulo() + "\n\n" +
				"## " + getEmpresa() + "\n\n";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}
