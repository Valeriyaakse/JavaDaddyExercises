package mentorship.roadmap.Java_Core.step2_Base.topic4_Loops.task3_FactorialWhile;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt();
        factorialWhile(n);
    }
    public static void factorialWhile(int n) {
        int i = 1;
        int factorial = 1;
        while (i <=n) {
            factorial *=i;
            i += 1;
        }
        System.out.println(factorial);
    }

}
