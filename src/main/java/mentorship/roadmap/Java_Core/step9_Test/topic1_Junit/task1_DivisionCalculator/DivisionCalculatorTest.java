package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task1_DivisionCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionCalculatorTest {
    @Test
    void divideTest() {
        double divide = DivisionCalculator.divide(10,2);
        Assertions.assertEquals(5.0, divide,  0.00001);
    }
    @Test
    void divide_ByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> DivisionCalculator.divide(10,0) );
    }
}
