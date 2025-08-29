package mentorship.roadmap.Java_Core.step6_Collections.topic1_List.task2_LinkedList.subtask5_ListInterfaceDemo;

import java.util.LinkedList;
import java.util.List;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add(0,"aaa");
        list.add(1,"bbb");
        list.add(2,"ccc");
        list.add(3,"ddd");
        list.set(3, "eee");
        list.remove(2);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(i + " " + list.get(i));
        }


    }
}
