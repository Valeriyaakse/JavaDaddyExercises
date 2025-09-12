package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task5_PalindromeChecker;

public class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        if (  text == null || text.length() == 0) {
            return false;
        }
        String textForCheck = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(textForCheck).reverse().toString();
        return textForCheck.equals(reversed);
    }
}
