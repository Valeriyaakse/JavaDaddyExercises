package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task5_Finally;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("Ресурс открыт");
        try {
            int a =9;
            int b = 0;
            System.out.println(a/b);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Ресурс закрыт");
        }
    }
}
