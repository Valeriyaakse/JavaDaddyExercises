package mentorship.roadmap.Java_Core.step2_Base.topic6_ForEachLoops.task4_IsSortedAsc;

import java.util.Scanner;

public class IsSortedAsc {
    public static void main(String[] args) {
        isSortedAsc();
    }

    public static void isSortedAsc() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        boolean result = true;
        for (int i = 0; i < mas.length -2; i++) {
            if (mas[i]>mas[i+1]) {
                result = false;
                break;
            }
            }

        System.out.println(result);
    }
}
