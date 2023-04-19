public class CarroBasico {
	public String rodas;

	public CarroBasico(String rodas) {
		this.rodas = rodas;
	}
	
	public void printCarro() {
		System.out.println(
			"O TIPO DE CARRO É: BÁSICO \n" +
			"COMPONENTES: \n" +
			"	RODAS: " + this.rodas + "\n"
		);
	}
}