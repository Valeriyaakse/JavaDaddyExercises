package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task4_MinMaxFinder;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину массива");
        int n = scanner.nextInt();
        System.out.println("введите массив");
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(findMinMax(numbers)));
    }
    static int[] findMinMax(int... numbers) {
       int min = numbers[0];
       int max = numbers [0];
        for (int number : numbers) {
           if (number > max) { max = number;}
           if (number < min) { min = number;}
        }
        int result[] = new int[2];
        result[0] = min;
        result[1] = max;
        return result;
    }

}
