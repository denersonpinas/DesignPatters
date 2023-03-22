package components;

public class PlacaDeVideo {
    private String marca;
    private String modelo;
    private String memoriaVideo;
    
    public PlacaDeVideo(String marca, String modelo, String memoriaVideo) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaVideo = memoriaVideo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMemoriaVideo() {
        return memoriaVideo;
    }
    
}
