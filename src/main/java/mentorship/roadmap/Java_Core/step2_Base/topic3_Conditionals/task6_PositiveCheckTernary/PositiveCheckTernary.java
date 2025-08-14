package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task6_PositiveCheckTernary;

import java.util.Scanner;

public class PositiveCheckTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        positiveCheckTernary(number);
    }
    public static void positiveCheckTernary(int number) {

        String result = (number > 0) ? "Положительное" : "Нулевое или отрицательное";
        System.out.println(result);
    }
}
