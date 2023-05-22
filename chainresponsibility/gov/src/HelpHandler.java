public abstract class HelpHandler {
    private HelpHandler handler;

    public HelpHandler(){}

    public HelpHandler(HelpHandler handler) {
        this.handler = handler;
    }

    public void handleHelp() {
        if(this.handler != null){
            System.out.println("Repassou o chamado...");
            this.handler.handleHelp();
        }else{
            System.out.println("Error...");
            
        }
    }
}