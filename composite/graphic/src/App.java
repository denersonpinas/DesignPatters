public class App {
    public static void main(String[] args) throws Exception {
        Graphic g = new Picture();
        Graphic p = new Picture();
        Line l = new Line();
        Rectangle r = new Rectangle();
        Text t = new Text();
        p.add(l);
        p.add(r);
        p.add(t);

        Line l1 = new Line();
        Rectangle r1 = new Rectangle();

        g.add(p);
        g.add(l1);
        g.add(r1);

        g.draw();
    }
}

