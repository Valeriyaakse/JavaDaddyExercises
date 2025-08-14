package mentorship.roadmap.Java_Core.step2_Base.topic6_ForEachLoops.task2_ForEachStringPrint;

import java.util.Scanner;

public class ForEachStringPrint {
    public static void main(String[] args) {
        forEachStringPrint();
    }

    public static void forEachStringPrint() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
       String [] mas = new String[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextLine();
        }

        for (String str : mas) {
                System.out.println(str);
        }

    }
}
