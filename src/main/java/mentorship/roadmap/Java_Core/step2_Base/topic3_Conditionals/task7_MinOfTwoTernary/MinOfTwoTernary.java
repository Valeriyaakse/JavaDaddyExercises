package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task7_MinOfTwoTernary;

import java.util.Scanner;

public class MinOfTwoTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        positiveCheckTernary(number1, number2);
    }
    public static void positiveCheckTernary(int number1, int number2) {
        int result = (number1 > number2) ? number2 : number1;
        System.out.println(result);
    }
}
