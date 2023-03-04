package ifba.elementos.latex;

import ifba.elementos.Cabecalho;

public class CabecalhoLATEX extends Cabecalho {

    @Override
    public String getOutput() {
        return "\\documentclass{article} \n" + 
        "\\usepackage{graphicx} % Required for inserting images \n"+
        "\\title{"+ getTitulo()+"}\n"+
        "\\author{"+ getEmpresa() +"}\n";
    }    
}
