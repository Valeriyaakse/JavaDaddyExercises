package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task2_InvalidAgeException;

public class AgeChecker {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
           throw new InvalidAgeException("Возраст должен быть от 0 до 150");
        }
    }
    public static void main(String[] args) {
       try{
           AgeChecker.checkAge(1230);
       } catch (InvalidAgeException exception) {
           System.out.println(exception.getMessage());
       }

    }
}
