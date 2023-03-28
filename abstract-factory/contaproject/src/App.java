import fabricas.FabricaContaCorrente;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente(new FabricaContaCorrente());
        System.out.println(cliente.geraConta());
    }
}
