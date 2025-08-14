package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task6_PrimeChecker;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int number = scanner.nextInt();
        System.out.println(isPrime(number));
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
      return true;
    }
}
