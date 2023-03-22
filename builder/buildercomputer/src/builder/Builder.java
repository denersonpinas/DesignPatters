package builder;

import components.Armazenamento;
import components.MemoriaRAM;
import components.Monitor;
import components.PlacaDeVideo;
import components.Processador;

public interface Builder {
    void setProcessador(Processador processador);
    void setMemoriaRAM(MemoriaRAM memoriaRAM);
    void setMonitor(Monitor monitor);
    void setPlacaDeVideo(PlacaDeVideo placaDeVideo);
    void setArmazenamento(Armazenamento armazenamento);
}