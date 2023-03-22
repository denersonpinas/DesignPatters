package components;

public class Monitor {
    private String marca;
    private String tamanho;
    private String tipoPainel;
    
    public Monitor(String marca, String tamanho, String tipoPainel) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.tipoPainel = tipoPainel;
    }

    public String getMarca() {
        return marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getTipoPainel() {
        return tipoPainel;
    }
}
