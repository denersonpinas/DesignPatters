package ifba.elementos.concretos;

import java.util.Date;

import ifba.elementos.IRodape;

public class RodapeConcreto implements IRodape {
	Date data;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
