package model;

public class IteratorProdutoVetor implements ProfileIterator {
    private Produto colect[];
    private int count;
    private int qtd;

    public IteratorProdutoVetor() {
        this.colect = new Produto[10];
        this.count = 0;
        this.qtd = 0;
    }

    public void add(Produto novoProduto) {
        colect[qtd] = novoProduto;
        qtd++;
    }

    @Override
    public boolean hasNext() {
        if(count >= colect.length || colect[count] == null){
            count = 0;
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Produto next() {
        Produto produto = colect[count];
        ++count;
        return produto;
    }
}
