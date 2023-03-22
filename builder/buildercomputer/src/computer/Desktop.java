package computer;

import components.Armazenamento;
import components.MemoriaRAM;
import components.Monitor;
import components.PlacaDeVideo;
import components.Processador;

public class Desktop {
    private Armazenamento armazenamento;
    private MemoriaRAM memoriaRAM;
    private Monitor monitor;
    private PlacaDeVideo placaDeVideo;
    private Processador processador;
    
    public Desktop(Armazenamento armazenamento, MemoriaRAM memoriaRAM, Monitor monitor,
            PlacaDeVideo placaDeVideo, Processador processador) {
        this.armazenamento = armazenamento;
        this.memoriaRAM = memoriaRAM;
        this.monitor = monitor;
        this.placaDeVideo = placaDeVideo;
        this.processador = processador;
    }     

    public String getDesktop() {
        return 
            "Armazenamento: \n"+
            "   Marca: " + armazenamento.getMarca() + "\n" + 
            "   Tamanho: " + armazenamento.getTamanho() + "\n" + 
            "   Tipo: " + armazenamento.getTipo() + "\n" +
            "Memoria RAM: \n"+
            "   Marca: " + memoriaRAM.getMarca() + "\n" + 
            "   Tamanho: " + memoriaRAM.getTamanho() + "\n" + 
            "   Tecnologia: " + memoriaRAM.getTecnologia() + "\n" +
            "   Velocidade: " + memoriaRAM.getVelocidade() + "\n" +
            "Monitor: \n"+
            "   Marca: " + monitor.getMarca() + "\n" + 
            "   Tamanho: " + monitor.getTamanho() + "\n" + 
            "   Tipo de Painel: " + monitor.getTipoPainel() + "\n" +
            "Placa de Video: \n"+
            "   Marca: " + placaDeVideo.getMarca() + "\n" + 
            "   Modelo: " + placaDeVideo.getModelo() + "\n" + 
            "   Memoria de Video: " + placaDeVideo.getMemoriaVideo() + "\n" +
            "Processador: \n"+
            "   Marca: " + processador.getMarca() + "\n" + 
            "   Modelo: " + processador.getModelo() + "\n" + 
            "   Velocidade: " + processador.getVelocidade() + "\n";
    }
}
