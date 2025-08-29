package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask2_StackLinkedList;

import java.util.LinkedList;

public class StackLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        System.out.println(linkedList.pop());
        System.out.println(linkedList.pop());
        System.out.println(linkedList.pop());
    }
}
