package mentorship.roadmap.Java_Core.step2_Base.topic3_Conditionals.task5_MaxOfThree;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        maxOfThree(a,b,c);
    }
    public static void maxOfThree(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max = b;
            if (max < c) {
                max = c;
            }
        }

        System.out.println(max);
    }
}
