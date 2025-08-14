package mentorship.roadmap.Java_Core.step2_Base.topic4_Loops.task2_SumWhileLoop;

import java.util.Scanner;

public class SumWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int N = scanner.nextInt();
        sumWhileLoop(N);
    }
    public static void sumWhileLoop(int N) {
        int i = 1;
        int sum = 0;
        while (i <=N) {
            sum +=i;
            i += 1;
        }
        System.out.println(sum);
    }

}

