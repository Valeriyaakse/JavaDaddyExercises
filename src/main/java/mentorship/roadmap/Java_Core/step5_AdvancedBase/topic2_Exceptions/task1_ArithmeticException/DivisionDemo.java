package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task1_ArithmeticException;

public class DivisionDemo {
    public static void main(String[] args) {
        try {
            int a = 20;
            int b = 3;
            System.out.println(a / b);
        } catch (ArithmeticException exception) {
            System.out.println("Ошибка. На ноль делить нельзя");
        }
    }
}
