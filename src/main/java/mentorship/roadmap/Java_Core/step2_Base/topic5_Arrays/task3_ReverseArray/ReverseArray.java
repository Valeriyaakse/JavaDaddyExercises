package mentorship.roadmap.Java_Core.step2_Base.topic5_Arrays.task3_ReverseArray;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        reverseArray();
    }
    public static void reverseArray() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        int i = mas.length-1;
        while (i > -1) {
            System.out.println(mas[i]);
            i -= 1;
        }
    }
}

