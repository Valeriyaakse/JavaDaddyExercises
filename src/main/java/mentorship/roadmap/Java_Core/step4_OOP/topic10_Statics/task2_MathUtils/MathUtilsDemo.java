package mentorship.roadmap.Java_Core.step4_OOP.topic10_Statics.task2_MathUtils;

import java.util.Scanner;

public class MathUtilsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(MathUtils.max(a,b));
    }
}
