package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask6_ArrayListSort;

import java.util.ArrayList;
import java.util.Comparator;

public class SortedArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(42);
        arrayList.add(17);
        arrayList.add(8);
        arrayList.add(99);
        arrayList.add(23);
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        arrayList.sort(comparator);

        System.out.println(arrayList);
    }


}
