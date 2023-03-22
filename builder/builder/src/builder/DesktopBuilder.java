package builder;

public class DesktopBuilder implements Builder {
    private Computador pc = new Computador();

    public void buildProcessador() {
        pc.setProcessador("Intel Core i7");
    }

    public void buildMemoriaRAM() {
        pc.setMemoriaRAM(16);
    }

    public void buildArmazenamento() {
        pc.setArmazenamento(1000);
    }

    public void buildPlacaDeVideo() {
        pc.setPlacaDeVideo("NVIDIA GeForce RTX 3070");
    }

    public void buildMonitor() {
        pc.setMonitor("Dell 27\" IPS");
    }

    public Computador getComputador() {
        return pc;
    }
}