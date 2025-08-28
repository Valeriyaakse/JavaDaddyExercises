package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task1_ArrayList.subtask1_ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(20);
        arrayList.add(200);
        arrayList.add(2);
        arrayList.add(240);
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value == 20) {
                iterator.remove();
                continue;
            }
            System.out.println(value);
        }
    }
}
