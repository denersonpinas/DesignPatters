package builder;

public class NotebookBuilder implements Builder {
    private Computador notebook = new Computador();

    public void buildProcessador() {
        notebook.setProcessador("Intel Core i5");
    }

    public void buildMemoriaRAM() {
        notebook.setMemoriaRAM(8);
    }

    public void buildArmazenamento() {
        notebook.setArmazenamento(512);
    }

    public void buildPlacaDeVideo() {
        notebook.setPlacaDeVideo("NVIDIA GeForce GTX 1650");
    }

    public void buildMonitor() {
        notebook.setMonitor("Acer 15.6\" Full HD");
    }

    public Computador getComputador() {
        return notebook;
    }
}