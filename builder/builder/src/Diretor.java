import builder.Builder;
import builder.Computador;

public class Diretor {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Computador getComputador() {
        return builder.getComputador();
    }

    public void construirComputador() {
        builder.buildProcessador();
        builder.buildMemoriaRAM();
        builder.buildArmazenamento();
        builder.buildPlacaDeVideo();
        builder.buildMonitor();
    }
}