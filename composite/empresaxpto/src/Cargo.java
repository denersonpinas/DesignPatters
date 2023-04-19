
public abstract class Cargo {
	String salario;

	public void printSalarioDoFuncionario() {
		System.out.println(this.salario);
	}

	protected abstract void adicionar(Cargo funcionario);

	protected abstract void remover(Cargo funcionario);
}
