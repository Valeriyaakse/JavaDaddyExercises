package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task5_SquareCalculator;

import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int number = scanner.nextInt();
        System.out.println(square(number));
    }
    public static int square(int number) {
        return number*number;
    }
}
