import iteratorInterface.IteratorDefault;
import model.IteratorVetor;
import model.IteratorVetorDesc;
import model.Product;

public class Cliente {
    public static void main(String[] args) throws Exception {
        IteratorVetor loja = new IteratorVetorDesc();
        IteratorDefault loja2 = new IteratorVetor();

        loja.add(new Product("Arroz", 5, 765));
        loja.add(new Product("Feijao", 5, 765));
        loja.add(new Product("Banana", 5, 765));
        loja.add(new Product("Salgadinho", 5, 765));
        loja.add(new Product("Pipoca", 5, 765));
        loja.add(new Product("Biscoito", 5, 765));
        loja.add(new Product("B", 5, 765));
        loja.add(new Product("C", 5, 765));
        loja.add(new Product("D", 5, 765));
        loja.add(new Product("E", 5, 765));

        System.out.println("\n Todos os Produtos: ");
        while (loja.hasNext()) {
            Product produto = loja.next();
            System.out.println(produto);
        }
    }
}
