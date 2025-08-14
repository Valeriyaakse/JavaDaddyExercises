package mentorship.roadmap.Java_Core.step2_Base.topic5_Arrays.task1_CountOccurrences;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        countOccurences();
    }
    public static void countOccurences() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mas = new int[n];
        int a = 5;
        int result = 0;
        for (int number : mas) {
            number = scanner.nextInt();
            if (number == a) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}
