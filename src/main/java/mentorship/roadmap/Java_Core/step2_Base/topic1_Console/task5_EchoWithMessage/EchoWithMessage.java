package mentorship.roadmap.Java_Core.step2_Base.topic1_Console.task5_EchoWithMessage;

import java.util.Scanner;

public class EchoWithMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        echoWithMessage(str);
    }

    public static void echoWithMessage(String str) {
        System.out.println("Вы ввели: " + str + ". Спасибо!");
    }
}
