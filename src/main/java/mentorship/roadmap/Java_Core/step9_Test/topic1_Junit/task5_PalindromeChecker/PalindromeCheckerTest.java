package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task5_PalindromeChecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {
    @Test
    void isPalindrome_TruePalindrome()  {
        Assertions.assertTrue( PalindromeChecker.isPalindrome("madam"));
    }

    @Test
    void isPalindrome_WithUpperCase()  {
        Assertions.assertTrue( PalindromeChecker.isPalindrome("Madam"));
    }

    @Test
    void isPalindrome_WithSpaces()  {
        Assertions.assertTrue( PalindromeChecker.isPalindrome("madam "));
    }

    @Test
    void isPalindrome_isEmpty()  {
        Assertions.assertFalse( PalindromeChecker.isPalindrome(""));
    }

    @Test
    void isPalindrome_isNull()  {
        Assertions.assertFalse( PalindromeChecker.isPalindrome(null));
    }
    @Test
    void isPalindrome_NotPalindrome() {
        Assertions.assertFalse(PalindromeChecker.isPalindrome("hello"));
    }

}
