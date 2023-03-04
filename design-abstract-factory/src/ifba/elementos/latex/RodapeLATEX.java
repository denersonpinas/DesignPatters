package ifba.elementos.latex;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ifba.elementos.Rodape;

public class RodapeLATEX extends Rodape {

    @Override
    public String getOutput() {
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        return "\\date{"+ df.format(getData()) +"}\n"+
        "\\end{document}";
    }
    
}
