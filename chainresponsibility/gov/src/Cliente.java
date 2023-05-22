public class Cliente {
    public static void main(String[] args) throws Exception {
        Widget widget = new Widget();
        Dialog dialog = new Dialog(widget);
        Button button = new Button(dialog, true);
        Button buttonA = new Button(dialog, false);

        button.handleHelp();
        buttonA.handleHelp();
    }
}
