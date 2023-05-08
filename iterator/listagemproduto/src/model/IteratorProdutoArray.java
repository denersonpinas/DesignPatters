package model;

import java.util.ArrayList;

public class IteratorProdutoArray implements ProfileIterator {
    private ArrayList<Produto> colect;
    private int count;
    private int qtd;

    public IteratorProdutoArray() {
        colect = new <Produto>ArrayList();
        count = 0;
        qtd = 0;
    }

    public void add(Produto novoProduto) {
        colect.add(novoProduto);
        qtd++;
    }

    @Override
    public boolean hasNext() {
        if(count >= colect.size() || colect.get(count) == null) {
            count = 0;
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Produto next() {
        Produto produto = colect.get(count);
        count++;
        return produto;
    }
}
