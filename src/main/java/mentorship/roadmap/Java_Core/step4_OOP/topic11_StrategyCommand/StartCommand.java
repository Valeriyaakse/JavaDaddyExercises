package mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand;

public class StartCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Starting...");
    }
}
