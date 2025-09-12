package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task4_WordCounter;

public class WordCounter {

    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.trim().split("\\s+").length;
    }

}
