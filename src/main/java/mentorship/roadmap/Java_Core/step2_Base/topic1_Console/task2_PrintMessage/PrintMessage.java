package mentorship.roadmap.Java_Core.step2_Base.topic1_Console.task2_PrintMessage;

import java.util.Scanner;

public class PrintMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        printMessage(str);
    }
    static void printMessage(String str) {
        System.out.println(str);
    }
}
