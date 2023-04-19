import java.util.List;

public abstract class Graphic {
    public abstract void add(Graphic g);
    public abstract void remove(Graphic g);
    public abstract List<Graphic> getChild();
    public abstract void draw(); // Faz algo efetivamente
}