package model;

public class Produto {
    private String nome;
    private Double preco;

    public Produto() {}

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return 
        "PRODUTO: \n" +
        "   NOME: " + this.nome + "\n" +
        "   PRECO: " + this.preco + "\n";
    }    
}
