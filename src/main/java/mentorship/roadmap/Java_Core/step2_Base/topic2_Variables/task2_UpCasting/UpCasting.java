package mentorship.roadmap.Java_Core.step2_Base.topic2_Variables.task2_UpCasting;

public class UpCasting {
    public static void main(String[] args) {
        int a = 1;
        upCasting(a);
    }
    public static void upCasting(int a) {
        double result = (double) a;
        System.out.println("исходное значение: " + a + "\n" + "результат преобразования: " + result);
    }
}
