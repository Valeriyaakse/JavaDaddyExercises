package mentorship.roadmap.Java_Core.step2_Base.topic5_Arrays.task4_MinInArray;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        minInArray();
    }
    public static void minInArray() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mas = new int[n];
        int min = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        min = mas[0];
        for (int number : mas) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println(min);
    }
}

