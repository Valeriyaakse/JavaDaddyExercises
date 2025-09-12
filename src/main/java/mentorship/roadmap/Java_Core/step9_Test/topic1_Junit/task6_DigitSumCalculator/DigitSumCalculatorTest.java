package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task6_DigitSumCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DigitSumCalculatorTest {
    @Test
    void sumDigits_DigitNumber() {
        Assertions.assertEquals(1, DigitSumCalculator.sumDigits(1));
    }

    @Test
    void sumDigits_MultiDigitNumber() {
        Assertions.assertEquals(1,  DigitSumCalculator.sumDigits(10));
    }
    @Test
    void sumDigits_negativeNumber() {
        Assertions.assertEquals(1,  DigitSumCalculator.sumDigits(-10));
    }

    @Test
    void sumDigits_Zero() {
        Assertions.assertEquals(0,  DigitSumCalculator.sumDigits(0));
    }

}
