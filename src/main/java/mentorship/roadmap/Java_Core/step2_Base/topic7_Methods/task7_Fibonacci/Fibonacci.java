package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task7_Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int number = scanner.nextInt();
        System.out.println(fibonacci(number));
    }
    public static int fibonacci(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;
        int numbersFibonacci[] = new int[number];
        numbersFibonacci[0] = 0;
        numbersFibonacci[1] = 1;
        for (int i = 2; i <= number-1; i++) {
            numbersFibonacci[i] = numbersFibonacci[i-1] + numbersFibonacci[i-2];
        }
        return numbersFibonacci[number-1];
    }
}
