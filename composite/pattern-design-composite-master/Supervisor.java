import java.util.ArrayList;

public abstract class Supervisor extends Funcionario{
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	public Supervisor(String nomeDoSupervisor) {
		this.nomeFuncionario = nomeDoSupervisor;
	}

	@Override
	public void printNomeDoFuncionario() {
		System.out.println(this.nomeFuncionario);
	}

	public void adicionar(Funcionario novoFuncionario) {
		this.funcionarios.add(novoFuncionario);
	}
	 
	public void remover(Supervisor funcionarioAExcluir) {
		this.funcionarios.remove(funcionarioAExcluir);
	}
}
