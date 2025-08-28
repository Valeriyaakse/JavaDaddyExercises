package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask3_MergeLists;

import java.util.ArrayList;

public class MergeLists {
    public static void main(String[] args) {
        ArrayList<String> first = new ArrayList<>();
        first.add("first1");
        first.add("first2");
        first.add("first3");
        first.add("first4");

        ArrayList<String> second = new ArrayList<>();
        second.add("second1");
        second.add("second2");
        second.add("second3");

        ArrayList<String> merge = new ArrayList<>(first);
        merge.addAll(second);
        System.out.println(merge);

    }
}
