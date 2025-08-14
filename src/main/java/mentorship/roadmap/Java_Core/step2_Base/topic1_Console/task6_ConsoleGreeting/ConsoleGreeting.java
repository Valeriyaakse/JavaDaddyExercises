package mentorship.roadmap.Java_Core.step2_Base.topic1_Console.task6_ConsoleGreeting;

import java.util.Scanner;

public class ConsoleGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        consoleGreeting(str);
    }

    public static void consoleGreeting(String str) {
        System.out.println("Привет, " + str + "! Добро пожаловать в Java.");
    }
}
