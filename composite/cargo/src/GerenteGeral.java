import java.util.ArrayList;
import java.util.List;

public class GerenteGeral implements Cargo {
    private List<Cargo> childs = new ArrayList<Cargo>();

    @Override
    public void add(Cargo funcionario) {
        childs.add(funcionario);
    }

    @Override
    public void remove(Cargo funcionario) {
        childs.remove(funcionario);
    }

    @Override
    public List<Cargo> getChild() {
        return childs;
    }

    @Override
    public void printSalario() {
        for (Cargo cargo : childs) {
            cargo.printSalario();
        }
    }
    
    
}
