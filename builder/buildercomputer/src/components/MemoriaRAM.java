package components;

public class MemoriaRAM {
    private String marca;
    private String tamanho;
    private String velocidade;
    private String tecnologia;
    
    public MemoriaRAM(String marca, String tamanho, String velocidade, String tecnologia) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.velocidade = velocidade;
        this.tecnologia = tecnologia;
    }

    public String getMarca() {
        return marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public String getTecnologia() {
        return tecnologia;
    }
}