package IteratorNaSala;

public class IteratorDesc implements InterfaceIterator {

	Produto[] itens;
	int posicao;

	public IteratorDesc(Produto[] itens) {
		this.itens = itens;
		this.posicao = itens.length - 1;
	}

	public Object proximo() {
		Produto menuItem = itens[posicao];
		posicao = posicao - 1;
		return menuItem;
	}

	public boolean existeProximo() {
		if (posicao <= 0) {
			return false;
		} else {
			return true;
		}
	}

}