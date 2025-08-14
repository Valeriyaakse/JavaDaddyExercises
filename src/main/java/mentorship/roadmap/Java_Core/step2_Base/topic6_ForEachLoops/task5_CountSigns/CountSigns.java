package mentorship.roadmap.Java_Core.step2_Base.topic6_ForEachLoops.task5_CountSigns;

import java.util.Scanner;

public class CountSigns {
    public static void main(String[] args) {
        countSigns();
    }

    public static void countSigns() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        int sumPositive = 0;
        int sumNegative = 0;
        int sumZero = 0;
        for (int number : mas) {
            if (number > 0) {
                sumPositive +=1;
            } else if (number < 0) {
                sumNegative +=1;
            } else {
                sumZero +=1;
            }
        }

        System.out.println("Positive " + sumPositive + " Negative " + sumNegative + " Zero " + sumZero);
    }
}
