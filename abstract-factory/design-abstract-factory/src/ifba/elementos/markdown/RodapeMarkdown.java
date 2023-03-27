package ifba.elementos.markdown;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import ifba.elementos.Rodape;

public class RodapeMarkdown implements Rodape {
	Date data;

	@Override
	public String getOutput() {
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		return "------------------------------\n\n" + df.format(getData()) + "\n";
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
