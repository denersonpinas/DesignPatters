import java.util.ArrayList;

public abstract class GerenteGeral extends Cargo{
	ArrayList<Cargo> funcionarios = new ArrayList<Cargo>();

	public GerenteGeral(String salario) {
		this.salario = salario;
	}

	@Override
	public void printSalarioDoFuncionario() {
		System.out.println(this.salario);
	}

	public void adicionar(Cargo novoFuncionario) {
		this.funcionarios.add(novoFuncionario);
	}
	 
	public void remover(GerenteGeral funcionarioAExcluir) {
		this.funcionarios.remove(funcionarioAExcluir);
	}
}
