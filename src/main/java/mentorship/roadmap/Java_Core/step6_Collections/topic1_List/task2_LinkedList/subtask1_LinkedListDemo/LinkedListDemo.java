package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask1_LinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.addFirst("Zero");
        linkedList.addLast("Four");
        linkedList.removeFirst();
        linkedList.removeLast();
        for(String value : linkedList) {
            System.out.println(value);
        }
    }
}
