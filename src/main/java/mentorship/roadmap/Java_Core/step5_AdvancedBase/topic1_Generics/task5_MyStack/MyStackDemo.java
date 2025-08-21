package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task5_MyStack;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack();
        stack.push(2);
        stack.push(33);
        stack.push(4);
        stack.push(55);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.isEmpty();
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.isEmpty();


    }


}
