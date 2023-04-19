public class App {
    public static void main(String[] args) throws Exception {
        Cargo gerente = new Gerente("2500");
	    Cargo desenvolvedor = new Desenvolvedor("1200");
	    Cargo desenvolvedor2 = new Desenvolvedor("1200");

	    gerente.adicionar(desenvolvedor);
	    gerente.printSalarioDoFuncionario();
	    gerente.adicionar(desenvolvedor2);
	    gerente.printSalarioDoFuncionario();
	    gerente.remover(desenvolvedor);
    }
}
