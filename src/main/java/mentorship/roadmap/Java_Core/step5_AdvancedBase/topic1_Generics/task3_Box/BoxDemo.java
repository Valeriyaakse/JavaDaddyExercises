package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task3_Box;

public class BoxDemo {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setValue("hello");
        System.out.println(box1.getValue());
        box1.setValue("goodbye");
        System.out.println(box1.getValue());
    }
}
