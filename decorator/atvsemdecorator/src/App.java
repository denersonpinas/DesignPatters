public class App {

	public static void main(String[] args) {
		CarroBasico basico = new CarroBasico("roda de aço com aro de 14 polegadas");
		basico.printCarro();
		
		CarroEsportivo esporte = new CarroEsportivo(" roda de liga leve com aro de 19 ou 20 polegadas", true);
		esporte.printCarro();

		CarroLuxo luxo = new CarroLuxo("roda de liga leve com aro de 18 polegadas", true);
		luxo.printCarro();

	}

}
