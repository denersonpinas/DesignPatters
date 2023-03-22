import builder.DesktopBuilder;
import computer.Desktop;
import diretor.Diretor;

public class App {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();

        DesktopBuilder builder = new DesktopBuilder();
        diretor.constructDesktop(builder);
        Desktop pc = builder.getBuilder();
        System.out.println("Desktop built:\n" + pc.getDesktop());
    }
}
