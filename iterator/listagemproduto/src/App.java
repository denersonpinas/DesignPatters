import model.IteratorProdutoVetor;
import model.Produto;
import model.ProfileIterator;

public class App {
	public static void main(String args []) {
		ProfileIterator produtoA = new IteratorProdutoVetor();

        produtoA.add(new Produto("Banana", 5.0));

        System.out.println("\n Todos os Alunos: ");
        while (produtoA.hasNext()) {
            Produto produto = (Produto) produtoA.next();
            System.out.println(produto);
        }
	}
}