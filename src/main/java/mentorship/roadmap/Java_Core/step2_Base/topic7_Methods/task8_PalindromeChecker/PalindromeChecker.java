package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task8_PalindromeChecker;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку");
        String text = scanner.nextLine();
        System.out.println(isPalindrome(text));
    }
    public static boolean isPalindrome(String text) {
        String newText = text.trim().toLowerCase();
        boolean result = true;
        for (int i = 0; i < (newText.length() - 1)/2 ; i++) {
           if (newText.charAt(i) != newText.charAt(newText.length() - 1 - i)) {
               result = false;
               break;
           }
        }
        return result;
    }
}
