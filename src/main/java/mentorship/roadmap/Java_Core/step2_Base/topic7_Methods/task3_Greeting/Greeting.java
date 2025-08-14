package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task3_Greeting;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(getGreeting(name));
    }
    static  String getGreeting(String name) {
        return "Привет, " + name + "!";
    }
}
