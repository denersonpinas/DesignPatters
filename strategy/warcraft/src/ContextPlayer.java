import strategyinterface.MovimentoStrategy;

public class ContextPlayer {
    private Integer coordenadaX;
    private Integer coordenadaY;
    private String name;    


    public ContextPlayer(Integer coordenadaX, Integer coordenadaY, String name) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.name = name;
    }

    void movimentar( MovimentoStrategy movimentoStrategy ) {
        movimentoStrategy.mover(coordenadaX, coordenadaY);
    }

    void getName() {
        System.out.println("HI, I'm " + this.name);
    }

}
