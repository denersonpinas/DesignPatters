package components;

public class Armazenamento {
    private String marca;
    private String tipo;
    private String tamanho;
    
    public Armazenamento(String marca, String tipo, String tamanho) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

}
