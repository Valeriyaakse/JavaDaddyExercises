package mentorship.roadmap.Java_Core.step2_Base.topic2_Variables.task5_OverFlow;

public class OverFlowDemo {
    public static void main(String[] args) {
        byte a = 127;
        byte b = (byte) (a + 1);
        System.out.println(a + " " + b);
    }
}
