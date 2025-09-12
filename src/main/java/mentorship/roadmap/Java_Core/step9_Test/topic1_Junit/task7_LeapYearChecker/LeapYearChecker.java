package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task7_LeapYearChecker;

public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
       if(year % 4 == 0) {
           if (year % 100 == 0 && year % 400 != 0) {
               return false;
           }
           return true;
       } else {
           return false;
       }
    }
}
