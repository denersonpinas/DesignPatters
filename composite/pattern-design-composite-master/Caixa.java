
public class Caixa extends Funcionario{
	public Caixa (String nomeDoCaixa) {
        this.nomeFuncionario = nomeDoCaixa;;
    }

    @Override
    public void printNomeDoFuncionario() {
        System.out.println(this.nomeFuncionario);
    }

	@Override
	protected void adicionar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void remover(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}
}
