import decoratorConcret.IaMago;
import decoratorConcret.IaNpc;
import decoratorConcret.IaOrcs;
import decoratorInterface.IaGame;

public class Cliente {
    public static void main(String[] args) throws Exception {
        IaGame npc = new IaNpc();
        npc.construitPlayer();

        IaGame orcs = new IaOrcs(new IaNpc());
        orcs.construitPlayer();

        IaGame mago = new IaMago(orcs);
        mago.construitPlayer();
    }
}
