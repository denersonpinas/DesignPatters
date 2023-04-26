package decoratorConcret;

import decoratorInterface.IaGame;

public class IaGameDecorator implements IaGame {

    IaGame iaGame;

    public IaGameDecorator(IaGame iaGame) {
        this.iaGame = iaGame;
    }

    @Override
    public void ataque() {
        // TODO Auto-generated method stub
    }

    @Override
    public void defesa() {
        // TODO Auto-generated method stub
    }

    @Override
    public void Life() {
        // TODO Auto-generated method stub
    }

    @Override
    public void construirUnidades() {
        // TODO Auto-generated method stub
    }

    @Override
    public void enviarUnidades() {
        // TODO Auto-generated method stub
    }

    @Override
    public void construirEstruturas() {
        // TODO Auto-generated method stub
    }

    @Override
    public void coletarRecursos() {
        // TODO Auto-generated method stub
    }

    @Override
    public void construitPlayer() {
        // TODO Auto-generated method stub
        System.out.println("Construindo Player...");
        this.iaGame.construitPlayer();
    }
    
}
