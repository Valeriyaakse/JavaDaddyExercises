package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task2_TreeSet.subtask2_TreeSetWithComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithComparator {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.compareTo(o2) > 0) {
                  return 1;
                } else if (o1.compareTo(o2) < 0) { return -1;}
                else return 0;
            }
        });
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Banana");
        treeSet.add("Carrot");
        treeSet.add("Berries");
        System.out.println(treeSet);

    }
}
