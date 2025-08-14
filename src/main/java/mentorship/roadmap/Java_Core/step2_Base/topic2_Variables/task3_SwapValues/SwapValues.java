package mentorship.roadmap.Java_Core.step2_Base.topic2_Variables.task3_SwapValues;

public class SwapValues {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        swapValues(a,b);
    }
    public static void swapValues(int a, int b) {
        System.out.println(a + " " + b);
        int c = b;
        b = a;
        a = c;
        System.out.println(a + " " + b);

    }

}
