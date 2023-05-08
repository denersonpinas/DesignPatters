package model;

public interface ProfileIterator {
    boolean hasNext();
    Object next();
    void add(Produto novoProduto);
}
