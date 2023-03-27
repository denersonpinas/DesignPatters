package ifba.elementos.html;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ifba.elementos.ICabecalho;
import ifba.elementos.ICorpo;
import ifba.elementos.IDocuments;
import ifba.elementos.IRodape;

public class HTMLDocuments implements IDocuments {
    ICabecalho iCabecalho;
    ICorpo iCorpo;
    IRodape iRodape;
    
    public HTMLDocuments(ICabecalho iCabecalho, ICorpo iCorpo, IRodape iRodape) {
      this.iCabecalho = iCabecalho;
      this.iCorpo = iCorpo;
      this.iRodape = iRodape;
    }

    public String getiCabecalho() {
      return "<html><head><title>" + iCabecalho.getTitulo() + "</title></head><body>\n" +
      "<h1>" + iCabecalho.getTitulo() + "</h1>\n" +
      "<h2>" + iCabecalho.getEmpresa() + "</h2>\n";
    }

    public String getiCorpo() {
      return "<p>" + iCorpo.getTexto() + "</p>";
    }

    public String getiRodape() {
      DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		return "<hr/>" + df.format(iRodape.getData()) +
				"</body></html>\n";
    }

    @Override
    public String getDocumento() {      
      return getiCabecalho() + "\n" +
        getiCorpo() + "\n" +
        getiRodape();
    }    
}
