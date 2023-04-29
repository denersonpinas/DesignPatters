import strategyconcret.MovimentoAndar;
import strategyconcret.MovimentoCorrer;
import strategyconcret.MovimentoRastejar;

public class Cliente {
    public static void main(String[] args) throws Exception {
        ContextPlayer player = new ContextPlayer(0, 0, "Neymar");

        player.getName();
        player.movimentar( new MovimentoAndar() );

        player.getName();
        player.movimentar( new MovimentoCorrer() );
        
        player.getName();
        player.movimentar( new MovimentoRastejar() );
    }
}
