package IteratorNaSala;

public class App {
	public static void main(String args []) {
		int limite = 10;
		Produto [] meusProdutos = new Produto[limite];

		for (int i = 0; i < limite; i++) {
			meusProdutos[i] = new Produto("Produto teste " + i);
		  }
	
		//InterfaceIterator meuIterator = new Iterator(meusProdutos);
		InterfaceIterator meuIterator = new IteratorDesc(meusProdutos);

		while (meuIterator.existeProximo()) {
			Produto atualProduto = (Produto)meuIterator.proximo();
			System.out.println(atualProduto.getNome());
		}
	}
}