import app.Aplication;
import app.LivrariaFactoryG1;

public class App {
    public static void main(String[] args) {
        Aplication app = new Aplication(new LivrariaFactoryG1());
        app.paint();
    }
}
