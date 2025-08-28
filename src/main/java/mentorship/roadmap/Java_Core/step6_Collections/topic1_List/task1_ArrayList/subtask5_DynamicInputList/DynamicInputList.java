package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask5_DynamicInputList;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicInputList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String str = scanner.nextLine();
           if (str.equalsIgnoreCase("стоп")) {break;}
            arrayList.add(str);
        }

        System.out.println(arrayList.size() + " " + arrayList);
    }
}
