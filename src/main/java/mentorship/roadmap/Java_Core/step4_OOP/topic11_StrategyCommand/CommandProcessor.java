package mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand;

import java.util.HashMap;

public class CommandProcessor {

    String command;
    public CommandProcessor(String command) {
        this.command = command;
    }
    public static void getCommand(String command) {
        HashMap<String, Command> hashMap = new HashMap<>();
        hashMap.put("start", new StartCommand());
        hashMap.put("stop", new StopCommand());
        hashMap.put("pause", new PauseCommand());
        hashMap.put("exit", new ExitCommand());
        hashMap.get(command).execute();
    }


}
