public class Button extends HelpHandler {

    private boolean active;

    public Button(HelpHandler handler, boolean active) {
        super(handler);
        this.active = active;
    }

    @Override
    public void handleHelp() {
        if(active)
            System.out.println("Tratou o Help Aqui!");
        else
            super.handleHelp();
    }
    
}
