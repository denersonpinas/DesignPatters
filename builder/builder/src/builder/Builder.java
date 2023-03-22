package builder;

public interface Builder {
    public void buildProcessador();
    public void buildMemoriaRAM();
    public void buildArmazenamento();
    public void buildPlacaDeVideo();
    public void buildMonitor();
    public Computador getComputador();
}
