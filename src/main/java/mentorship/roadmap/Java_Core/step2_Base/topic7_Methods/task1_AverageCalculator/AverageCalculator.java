package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task1_AverageCalculator;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] numbers = new double[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }
        System.out.println(getAverage(numbers));

    }
    static double getAverage(double[] numbers) {
      double sum = 0;
        for ( double number : numbers) {
          sum += number;
        }
        return sum / numbers.length;
    }
}
