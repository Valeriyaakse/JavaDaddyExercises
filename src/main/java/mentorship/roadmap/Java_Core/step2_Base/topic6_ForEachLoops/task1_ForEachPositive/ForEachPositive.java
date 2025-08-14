package mentorship.roadmap.Java_Core.step2_Base.topic6_ForEachLoops.task1_ForEachPositive;

import java.util.Scanner;

public class ForEachPositive {
    public static void main(String[] args) {
        forEachPositive();
    }

    public static void forEachPositive() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }

        for (int number : mas) {
            if (number > 0) {
                System.out.println(number);
            }
        }

    }
}

