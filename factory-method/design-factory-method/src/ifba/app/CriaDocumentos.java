package ifba.app;
import java.util.Date;
import ifba.elementos.IDocuments;

public class CriaDocumentos implements AbstractFactory {

    @Override
    public String geraDocumentacao(IDocuments iDocuments) {
        iDocuments.setTitulo("Padroes de projeto");
		iDocuments.setEmpresa("Insituto Federal da Bahia");
		iDocuments.setTexto("Aula de padroes de projeto.");

		iDocuments.setData(new Date());
		
		return iDocuments.getOutput();
    }
    
}
