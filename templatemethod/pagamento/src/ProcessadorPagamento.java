public abstract class ProcessadorPagamento {
    
    // TEMPLATE
    public void processadorPagamento() {
        preparar();
        validar();
        debitar();
        notificar();
        finalizar();
    }

    protected abstract void debitar();

    private void preparar() {
        System.out.println("Separando produto...");
    }
    private void validar() {
        System.out.println("Validando cadastro...");
    }
    protected void notificar() {
        System.out.println("Notificando usuário...");
    }
    protected void finalizar() {
        System.out.println("Finalizando compra...");
    }
}
