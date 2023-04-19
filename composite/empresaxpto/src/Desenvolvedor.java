
public class Desenvolvedor extends Cargo{
	public Desenvolvedor (String nomeDoDesenvolvedor) {
        this.salario = nomeDoDesenvolvedor;;
    }

    @Override
    public void printSalarioDoFuncionario() {
        System.out.println(this.salario);
    }

	@Override
	protected void adicionar(Cargo funcionario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void remover(Cargo funcionario) {
		// TODO Auto-generated method stub
		
	}
}
