import builder.Builder;
import builder.Computador;
import builder.DesktopBuilder;
import builder.NotebookBuilder;

public class App {
    public static void main(String[] args) throws Exception {
        // Instanciando um objeto do tipo Diretor
        Diretor diretor = new Diretor();

        // Instanciando um objeto do tipo DesktopBuilder
        Builder desktopBuilder = new DesktopBuilder();

        // Passando o objeto builder criado para o diretor
        diretor.setBuilder(desktopBuilder);

        // Construindo o objeto complexo utilizando o método construirComputador() do diretor
        diretor.construirComputador();

        // Obtendo o objeto complexo construído utilizando o método getComputador() do diretor
        Computador pcDesktop = diretor.getComputador();

        // Imprimindo as informações do objeto complexo construído
        System.out.println("PC desktop construído:");
        System.out.println("Processador: " + pcDesktop.getProcessador());
        System.out.println("Memória RAM: " + pcDesktop.getMemoriaRAM() + " GB");
        System.out.println("Armazenamento: " + pcDesktop.getArmazenamento() + " GB");
        System.out.println("Placa de vídeo: " + pcDesktop.getPlacaDeVideo());
        System.out.println("Monitor: " + pcDesktop.getMonitor());

        // Instanciando um objeto do tipo NotebookBuilder
        Builder notebookBuilder = new NotebookBuilder();

        // Passando o objeto builder criado para o diretor
        diretor.setBuilder(notebookBuilder);

        // Construindo o objeto complexo utilizando o método construirComputador() do diretor
        diretor.construirComputador();

        // Obtendo o objeto complexo construído utilizando o método getComputador() do diretor
        Computador notebook = diretor.getComputador();

        // Imprimindo as informações do objeto complexo construído
        System.out.println("Notebook construído:");
        System.out.println("Processador: " + notebook.getProcessador());
        System.out.println("Memória RAM: " + notebook.getMemoriaRAM() + " GB");
        System.out.println("Armazenamento: " + notebook.getArmazenamento() + " GB");
        System.out.println("Placa de vídeo: " + notebook.getPlacaDeVideo());
        System.out.println("Monitor: " + notebook.getMonitor());
    }
}
