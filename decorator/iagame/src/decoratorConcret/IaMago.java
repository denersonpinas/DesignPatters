package decoratorConcret;

import decoratorInterface.IaGame;

public class IaMago extends IaGameDecorator{
    @Override
    public void construitPlayer() {
        super.construitPlayer();
    }

    public IaMago(IaGame iaGame) {
        super(iaGame);
        System.out.println("Agora eu sou um Mago!");
    }   
}
