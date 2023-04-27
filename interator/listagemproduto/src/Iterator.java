package IteratorNaSala;

public class Iterator implements InterfaceIterator {

	private Produto[] itens;
	private int posicao = 0;

	public Iterator(Produto[] itens) {
		this.itens = itens;
	}

	public Object proximo() {
		Produto menuItem = itens[posicao];
		posicao = posicao + 1;
		return menuItem;
	}

	public boolean existeProximo() {
		if (posicao >= itens.length || itens[posicao] == null) {
			return false;
		} else {
			return true;
		}
	}

}