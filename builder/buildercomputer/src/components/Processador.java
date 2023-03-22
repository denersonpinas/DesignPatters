package components;

public class Processador {
    private String marca;
    private String modelo;
    private String velocidade;
    
    public Processador(String marca, String modelo, String velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getVelocidade() {
        return velocidade;
    }
}
