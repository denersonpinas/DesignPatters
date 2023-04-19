public class CarroLuxo extends CarroBasico {
	private boolean bancosCouro;
	
	public CarroLuxo(String rodas, boolean bancosCouro) {
		super(rodas);
		this.bancosCouro = bancosCouro;
	}

	@Override
	public void printCarro() {
		System.out.println(
			"O TIPO DE CARRO É: LUXO \n" +
			"COMPONENTES: \n" +
			"	RODAS: 			" + this.rodas + "\n" +
			"	BANCO DE COURO: " + this.bancosCouro + "\n"
		);
	}
}
