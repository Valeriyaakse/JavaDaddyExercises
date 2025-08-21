package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task5_MyStack;

import java.util.ArrayList;

public class MyStack <T> {
    private ArrayList<T> collection;
    MyStack() {
        collection = new ArrayList<>();
    }

    void push(T element){
        collection.add(element);
    }

    T pop() {
        return collection.remove(0);

    }

    T peek(){
        return collection.get(0);

    }

    void isEmpty() {
        if (collection.isEmpty()) {
            System.out.println("стек пуст");
        } else {
            System.out.println("стек не пуст");
        }
    }
}
