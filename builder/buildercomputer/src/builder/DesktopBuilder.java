package builder;

import components.Armazenamento;
import components.MemoriaRAM;
import components.Monitor;
import components.PlacaDeVideo;
import components.Processador;
import computer.Desktop;

public class DesktopBuilder implements Builder {
    private Armazenamento armazenamento;
    private MemoriaRAM memoriaRAM;
    private Monitor monitor;
    private PlacaDeVideo placaDeVideo;
    private Processador processador;

    @Override
    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    @Override
    public void setMemoriaRAM(MemoriaRAM memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void setPlacaDeVideo(PlacaDeVideo placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    @Override
    public void setArmazenamento(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }    
    
    public Desktop getBuilder() {
        return new Desktop(armazenamento, memoriaRAM, monitor, placaDeVideo, processador);
    }
}
