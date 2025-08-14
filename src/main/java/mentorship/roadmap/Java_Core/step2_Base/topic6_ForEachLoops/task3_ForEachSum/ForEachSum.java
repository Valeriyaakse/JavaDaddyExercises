package mentorship.roadmap.Java_Core.step2_Base.topic6_ForEachLoops.task3_ForEachSum;

import java.util.Scanner;

public class ForEachSum {
    public static void main(String[] args) {
        forEachSum();
    }

    public static void forEachSum() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
int sum = 0;
        for (int number : mas) {
           sum += number;
        }
        System.out.println(sum);
    }
}
