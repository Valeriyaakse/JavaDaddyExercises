package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask6_PerformanceCompare;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceCompare {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 10000; i< 110000; i++) {
            arrayList.addLast(i);
            linkedList.addLast(i);
        }

        long startTime1 = System.nanoTime();
        for (int i = 0; i<10000;i++) {
          arrayList.add(i);
        }
        long endTime1 = System.nanoTime();
        System.out.println("Время выполнения: " + (endTime1 - startTime1) + " наносекунд");

        long startTime2 = System.nanoTime();
        for (int i = 0; i<10000;i++) {
            linkedList.add(i);
        }
        long endTime2 = System.nanoTime();
        System.out.println("Время выполнения: " + (endTime2 - startTime2) + " наносекунд");
    }
}
