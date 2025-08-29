package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask3_QueueLinkedList;

import java.util.LinkedList;

public class QueueLinkedList {
    public static void main(String[] args) {

            LinkedList<Integer> linkedList = new LinkedList<>();
            linkedList.offer(2);
            linkedList.offer(3);
            linkedList.offer(4);
           while (!linkedList.isEmpty()) {
               System.out.println(linkedList.poll());
           }
    }
}
