package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task2_StringModifier;

import java.util.Scanner;

public class StringModifierDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String a = scanner.nextLine();
        scanner.close();
        StringModifier stringModifier = str -> str.toUpperCase() + "!";
        System.out.println(stringModifier.modify(a));
    }
}
