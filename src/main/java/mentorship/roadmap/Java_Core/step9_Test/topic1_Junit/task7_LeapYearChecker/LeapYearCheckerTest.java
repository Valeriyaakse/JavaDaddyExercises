package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task7_LeapYearChecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCheckerTest {
    @Test
    void isLeapYear_MultipleFour() {
        Assertions.assertTrue(LeapYearChecker.isLeapYear(4));
    }

    @Test
    void isLeapYear_MultipleHundredAndNotFourHundred() {
        Assertions.assertFalse(LeapYearChecker.isLeapYear(100));
    }

    @Test
    void isLeapYear_MultipleFourHundred() {
        Assertions.assertTrue(LeapYearChecker.isLeapYear(400));
    }

    @Test
    void isLeapYear_NotLeapYear() {
        Assertions.assertFalse(LeapYearChecker.isLeapYear(1111));
    }

}
