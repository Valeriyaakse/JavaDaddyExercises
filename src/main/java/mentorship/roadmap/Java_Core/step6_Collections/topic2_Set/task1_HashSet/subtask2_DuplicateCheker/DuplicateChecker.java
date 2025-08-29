package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask2_DuplicateCheker;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateChecker {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.equalsIgnoreCase("стоп")) {
                break;
            }

            if (hashSet.contains(str) == true) {
                System.out.println("Дубликат!");
            }
           else {
               hashSet.add(str);
           }
        }
        System.out.println(hashSet);
    }
}
