package ifba.elementos;
import java.util.Date;

public interface IDocuments {
    String getTitulo();

	void setTitulo(String titulo);

	String getEmpresa();

	void setEmpresa(String empresa);
	
	String getOutput();

    String getTexto();

	void setTexto(String texto);

    Date getData();

	void setData(Date data);
}
