package diretor;

import builder.Builder;
import components.Armazenamento;
import components.MemoriaRAM;
import components.Monitor;
import components.PlacaDeVideo;
import components.Processador;

public class Diretor {
    public void constructDesktop(Builder builder) {
        builder.setArmazenamento(new Armazenamento("Adata Legend 960 Max", "ssd", "2TB"));
        builder.setMemoriaRAM(new MemoriaRAM("Team Group T-Force Vulcan A", "32GB", "6000MHz", "DDR5"));
        builder.setMonitor(new Monitor("Samsung", "55", "VA"));
        builder.setPlacaDeVideo(new PlacaDeVideo("Zotac GeForce", "RTX 4090", "24G"));
        builder.setProcessador(new Processador("Itel", "Core i9-12900K", "3.2GHz"));
    }

    public void constructNotebook(Builder builder) {
        builder.setArmazenamento(new Armazenamento("", "ssd", "512GB"));
        builder.setMemoriaRAM(new MemoriaRAM("", "16GB", "3200MHz", "DDR4"));
        builder.setMonitor(new Monitor("", "15,6", "FHD"));
        builder.setPlacaDeVideo(new PlacaDeVideo("", "GDDR6", "4G"));
        builder.setProcessador(new Processador("Itel", "I5", "2.5GHz"));
    }
}
