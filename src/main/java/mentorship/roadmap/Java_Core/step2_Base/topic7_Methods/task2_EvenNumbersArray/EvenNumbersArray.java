package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task2_EvenNumbersArray;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNumbersArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину исходного массива");
        int m = scanner.nextInt();
        System.out.println("введите длину нового массива");
        int n = scanner.nextInt();
        System.out.println("введите массив чисел");
         if (n <=m ) {
             int[] numbers = new int[m];
             for (int i = 0; i < numbers.length; i++) {
                 numbers[i] = scanner.nextInt();
             }
             System.out.println(Arrays.toString(getEvenNumbers(numbers, n)));
         } else {
             System.out.println("длина нового массива должна быть меньше длины старого массива");
         }
    }
    static int[] getEvenNumbers(int[] numbers, int n) {
       int checker = 0;
        for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    checker +=1;
                }
        }
        int newNumbersLength = (n > checker) ? checker : n;
        int[] newNumbers = new int [newNumbersLength];
        int index = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                newNumbers[index++] = number;
                if (index == newNumbersLength) {
                    break;
                }
            }
        }
        return newNumbers;

    }
}
