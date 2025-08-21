package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task4_MultiExceptionDemo;

public class MultiExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[3]);
            String str = null;
            System.out.println(str.length());
        } catch (IndexOutOfBoundsException | NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
