package ifba.elementos.concretos;

import ifba.elementos.ICabecalho;

public class CabecalhoConcreto implements ICabecalho{
    String titulo;
	String empresa;

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
