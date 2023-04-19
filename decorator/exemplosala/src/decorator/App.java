package decorator;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro esporte = new CarroEsportivo(new CarroBasico());
		esporte.construir();
		
		
		Carro luxoesporte = new CarroEsportivo(new CarroLuxo(new CarroBasico()));
		luxoesporte.construir();

	}

}
