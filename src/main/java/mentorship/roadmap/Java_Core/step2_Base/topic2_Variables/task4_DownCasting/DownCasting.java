package mentorship.roadmap.Java_Core.step2_Base.topic2_Variables.task4_DownCasting;

public class DownCasting  {
    public static void main(String[] args) {
        double a = 1.2;
        downCasting(a);
    }
    public static void downCasting(double a) {
        int b = (int) a;
        boolean c = (b==a);
        System.out.println("double " + a + " int " + b + " сравнение " + c);
    }
}
