import java.util.List;

public class Desenvolvedor implements Cargo {
    
    String salario;
    
    public Desenvolvedor(String salario) {
        this.salario = salario;
    }


    @Override
    public void add(Cargo funcionario) {
    }

    @Override
    public void remove(Cargo funcionario) {
    }

    @Override
    public List<Cargo> getChild() {
        throw new UnsupportedOperationException("Unimplemented method 'getChild'");
    }

    @Override
    public void printSalario() {
        System.out.println("SALARIO DO DEV É: R$" + this.salario);
    }
    
}
