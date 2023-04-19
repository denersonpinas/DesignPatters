package decorator;

public class CarroEsportivo extends CarroDecorador {

	@Override
	public void construir() {
		// TODO Auto-generated method stub
		super.construir();
		
		
	}

	public CarroEsportivo(Carro carro) {
		super(carro);
		System.out.println("agora eu tenho recursos de carro de esportivo");
	}

}
