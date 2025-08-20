package mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand;

import java.util.Scanner;

public class StrategyCommandDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Commands: start, stop, pause, exit");
        System.out.println("Enter command: ");
        String command = input.nextLine();
        CommandProcessor.getCommand(command);
    }
}
