package mentorship.roadmap.Java_Core.step4_OOP.topic9_String.task1_StringConcat;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(str1.concat(str2));
    }
}
