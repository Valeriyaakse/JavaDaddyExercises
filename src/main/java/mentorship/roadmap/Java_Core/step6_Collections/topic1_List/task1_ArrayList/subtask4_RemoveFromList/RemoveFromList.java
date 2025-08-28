package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask4_RemoveFromList;

import java.util.ArrayList;

public class RemoveFromList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        arrayList.add("fourth");
        arrayList.add("fifth");
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.remove("fifth");
        System.out.println(arrayList);
    }
}
