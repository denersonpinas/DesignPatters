import java.util.HashMap;
import java.util.Map;

import commands.ButtonSomaCommand;
import commands.ButtonSubtracaoCommand;
import commands.Command;

public class Invoker {
    public static Map<String, Command> commands = new HashMap<String, Command>();

    static {
        commands.put("SOMA", new ButtonSomaCommand());
        commands.put("SUBTRACAO", new ButtonSubtracaoCommand());
    }

    public static void invoker(String command) {
        commands.get(command).execute();
    }
}