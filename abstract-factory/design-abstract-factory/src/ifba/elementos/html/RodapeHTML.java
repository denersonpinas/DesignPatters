package ifba.elementos.html;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import ifba.elementos.Rodape;

public class RodapeHTML implements Rodape {
	Date data;
	
	@Override
	public String getOutput() {
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		return "<hr/>" + df.format(getData()) +
				"</body></html>\n";
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
