import java.util.List;

public class Text extends Graphic {

    @Override
    public void add(Graphic g) {
    }

    @Override
    public void remove(Graphic g) {
    }

    @Override
    public List<Graphic> getChild() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChild'");
    }

    @Override
    public void draw() {
        System.out.println("Text");
    }
    
}
