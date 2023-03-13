package ifba.elementos.markdown;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ifba.elementos.IDocuments;

public class MarkdownDocuments implements IDocuments{
    String titulo;
	String empresa;
    String texto;
    Date data;

    @Override
    public String getTitulo() {
		return titulo;
	}

    @Override
    public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

    @Override
    public String getEmpresa() {
		return empresa;
	}

    @Override
    public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

    
    @Override
    public String getTexto() {
        return texto;
	}
    
    @Override
    public void setTexto(String texto) {
		this.texto = texto;
	}
    
    @Override
    public Date getData() {
		return data;
	}
    
    @Override
    public void setData(Date data) {
		this.data = data;
	}
    
    @Override
    public String getOutput() {
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        return "# " + getTitulo() + "\n\n" +
        "## " + getEmpresa() + "\n\n" + getTexto() + "\n\n" + "------------------------------\n\n" + df.format(getData()) + "\n";
    }
}
