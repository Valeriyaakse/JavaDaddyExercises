package mentorship.roadmap.Java_Core.step2_Base.topic1_Console.task4_CharAtDemo;

import java.util.Scanner;

public class CharAtDemo {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String str = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        int index = scanner2.nextInt();
        charAtDemo(str, index);
    }
    static void charAtDemo(String str,int index) {
        char symbol = str.charAt(index);
        System.out.println(symbol);
    }
}
