package ifba.elementos.markdown;

import ifba.elementos.ICabecalho;
import ifba.elementos.ICorpo;
import ifba.elementos.IDocuments;
import ifba.elementos.IRodape;

public class MarkdownDocuments implements IDocuments{
    ICabecalho iCabecalho;
    ICorpo iCorpo;
    IRodape iRodape;
    
    public MarkdownDocuments(ICabecalho iCabecalho, ICorpo iCorpo, IRodape iRodape) {
      this.iCabecalho = iCabecalho;
      this.iCorpo = iCorpo;
      this.iRodape = iRodape;
    }

    @Override
    public String getDocumento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDocumento'");
    }

    @Override
    public String getiCabecalho() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getiCabecalho'");
    }

    @Override
    public String getiCorpo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getiCorpo'");
    }

    @Override
    public String getiRodape() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getiRodape'");
    }


}
