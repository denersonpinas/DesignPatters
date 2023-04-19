
public class Gerente extends GerenteGeral{
	public Gerente(String salario) {
		super(salario);
        this.salario = salario;
    }

	@Override
    public void printSalarioDoFuncionario() {
        System.out.println(this.salario);
        for (Cargo funcionarioTmp : funcionarios) {
            funcionarioTmp.printSalarioDoFuncionario();
        }
    }
	
	@Override
	public void adicionar(Cargo novoFuncionario) {
		// TODO Auto-generated method stub
	}

	@Override
	protected void remover(Cargo funcionario) {
		// TODO Auto-generated method stub
	}
}
