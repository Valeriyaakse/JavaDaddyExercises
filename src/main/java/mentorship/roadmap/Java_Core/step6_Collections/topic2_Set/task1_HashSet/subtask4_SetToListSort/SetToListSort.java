package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask4_SetToListSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class SetToListSort {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i =0; i<=10; i++) {
            hashSet.add(i);
        }
        hashSet.add(333);
        hashSet.add(52);
        hashSet.add(18);
        System.out.println(hashSet);
        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);
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
