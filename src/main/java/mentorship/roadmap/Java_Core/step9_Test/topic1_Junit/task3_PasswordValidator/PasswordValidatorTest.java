package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task3_PasswordValidator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    @Test
    void isValid_ShortPassword() {
        boolean password = PasswordValidator.isValid("1234567");
        Assertions.assertFalse(password);
    }
    @Test
    void isValid_WithoutNumbers() {
        boolean password = PasswordValidator.isValid("abcdefght");
        Assertions.assertFalse(password);
    }
    @Test
    void isValid_TruePassword() {
        boolean password = PasswordValidator.isValid("aaa1234567");
        Assertions.assertTrue(password);
    }
    @Test
    void isValid_EmptyPassword() {
        boolean password = PasswordValidator.isValid("");
        Assertions.assertFalse(password);
    }

    @Test
    void isValid_NullPassword() {
        boolean password = PasswordValidator.isValid(null);
        Assertions.assertFalse(password);
    }

    @Test
    void isValid_PasswordWithSpacesAndDigits() {
        boolean password = PasswordValidator.isValid(" asd2<> d");
        Assertions.assertTrue(password);
    }

    @Test
    void isValid_PasswordOnlySpaces() {
        boolean password = PasswordValidator.isValid("   ");
        Assertions.assertFalse(password);
    }


}
