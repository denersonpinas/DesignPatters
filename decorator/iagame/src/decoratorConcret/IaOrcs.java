package decoratorConcret;

import decoratorInterface.IaGame;

public class IaOrcs extends IaGameDecorator {

    @Override
    public void construitPlayer() {
        super.construitPlayer();
    }

    public IaOrcs(IaGame iaGame) {
        super(iaGame);
        System.out.println("Agora eu sou um Orc!");
    }    
}
