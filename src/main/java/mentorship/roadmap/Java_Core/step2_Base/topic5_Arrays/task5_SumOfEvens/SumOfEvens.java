package mentorship.roadmap.Java_Core.step2_Base.topic5_Arrays.task5_SumOfEvens;

import java.util.Scanner;

public class SumOfEvens {
    public static void main(String[] args) {
        sumOfEvens();
    }
    public static void sumOfEvens() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mas = new int[n];
        int min = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int number : mas) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
