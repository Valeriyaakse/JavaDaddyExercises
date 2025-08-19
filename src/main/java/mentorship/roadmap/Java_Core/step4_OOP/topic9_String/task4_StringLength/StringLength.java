package mentorship.roadmap.Java_Core.step4_OOP.topic9_String.task4_StringLength;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("длина строки " + str.length());
    }
}
