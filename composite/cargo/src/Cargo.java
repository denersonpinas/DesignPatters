import java.util.List;

public interface Cargo {
    public abstract void add(Cargo funcionario);
    public abstract void remove(Cargo funcionario);
    public abstract List<Cargo> getChild();
    public abstract void printSalario();
}
