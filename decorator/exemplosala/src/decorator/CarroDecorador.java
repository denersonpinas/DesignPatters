package decorator;

public class CarroDecorador implements Carro {

	
	Carro carro;
	
	
	public CarroDecorador(Carro carro) {
		this.carro = carro;
	}

	@Override
	public void construir() {
		System.out.println("Decorando carros....");
		
		this.carro.construir();
		
	}
	
}
