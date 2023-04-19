
public class Gerente extends Supervisor{
	public Gerente(String nomeDoSupervisor) {
		super(nomeDoSupervisor);
        this.nomeFuncionario = nomeDoSupervisor;
    }

	@Override
    public void printNomeDoFuncionario() {
        System.out.println(this.nomeFuncionario);
        for (Funcionario funcionarioTmp : funcionarios) {
            funcionarioTmp.printNomeDoFuncionario();
        }
    }
	
	@Override
	public void adicionar(Funcionario novoFuncionario) {
		// TODO Auto-generated method stub
	}

	@Override
	protected void remover(Funcionario funcionario) {
		// TODO Auto-generated method stub
	}
}
