import context.UI;
import context.DocumentContext;

public class Client {
    public static void main(String[] args) throws Exception {
        DocumentContext document = new DocumentContext();
        UI context = new UI(document);
        context.init();
    }
}
