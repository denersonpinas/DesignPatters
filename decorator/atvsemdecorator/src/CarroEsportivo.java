public class CarroEsportivo extends CarroBasico {
	private Boolean motorPotente;

	public CarroEsportivo(String rodas, Boolean motorPotente) {
		super(rodas);
		this.motorPotente = motorPotente;
	}

	@Override
	public void printCarro() {
		System.out.println(
			"O TIPO DE CARRO É: ESPORTIVO \n" +
			"COMPONENTES: \n" +
			"	RODAS: 			" + this.rodas + "\n" +
			"	MOTOR POTENTE: 	" + this.motorPotente + "\n"
		);
	}
}
