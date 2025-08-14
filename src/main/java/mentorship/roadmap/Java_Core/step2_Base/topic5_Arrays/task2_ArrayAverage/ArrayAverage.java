package mentorship.roadmap.Java_Core.step2_Base.topic5_Arrays.task2_ArrayAverage;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        arrayAverage();
    }
    public static void arrayAverage() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mas = new int[n];
        int sum = 0;
        for (int number : mas) {
            number =  scanner.nextInt();
            sum += number;
        }
        int result = sum / mas.length;
        System.out.println("сумма " + sum + " среднее " + result);
    }
}
