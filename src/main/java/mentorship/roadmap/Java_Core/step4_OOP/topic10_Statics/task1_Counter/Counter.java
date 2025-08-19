package mentorship.roadmap.Java_Core.step4_OOP.topic10_Statics.task1_Counter;

public class Counter {
    private static int counter;
    public Counter() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
