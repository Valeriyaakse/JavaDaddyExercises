package mentorship.roadmap.Java_Core.step2_Base.topic4_Loops.task7_StringAnalyzer;

import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        stringAnalyzer(str);
    }
    public static void stringAnalyzer(String str) {
        char ch;
        int sumNumber = 0;
        int sumLetter = 0;
        int sumWhitespace = 0;
        int sumAnother = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sumNumber +=1;
            }
            else if (Character.isLetter(ch)) {
                sumLetter +=1;
            }
            else if (Character.isWhitespace(ch)) {
                sumWhitespace +=1;
            }
            else {
                sumAnother += 1;
            }
        }
        System.out.println("Буквы " + sumLetter + " цифры " + sumNumber + " пробелы " + sumWhitespace + " другие символы " + sumAnother);




    }
}
