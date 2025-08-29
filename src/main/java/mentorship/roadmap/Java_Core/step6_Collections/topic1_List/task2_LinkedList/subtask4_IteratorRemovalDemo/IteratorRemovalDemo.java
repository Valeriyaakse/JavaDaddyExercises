package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask4_IteratorRemovalDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorRemovalDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 1; i<=10; i++){
            linkedList.add(i);
        }
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Integer value = (Integer) iterator.next();
            if(value%2 == 0) {
                iterator.remove();
                continue;
            }
            System.out.println(value);
        }

    }
}
