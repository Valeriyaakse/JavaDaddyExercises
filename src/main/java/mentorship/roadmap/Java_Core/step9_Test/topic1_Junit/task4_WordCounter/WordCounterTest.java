package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task4_WordCounter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordCounterTest {
    @Test
    void countWords_TrueText() {
        Assertions.assertEquals(3, WordCounter.countWords("aaa aaa aaa"));
    }

    @Test
    void countWords_EmptyString() {
        Assertions.assertEquals(0, WordCounter.countWords(""));
    }

    @Test
    void countWords_WithManySpaces() {
        Assertions.assertEquals(2, WordCounter.countWords("aaa   aaa"));
    }

    @Test
    void countWords_WithTabAndNewline() {
        String text = "aaa\t\naaa";
        Assertions.assertEquals(2, WordCounter.countWords(text));
    }

    @Test
    void countWords_OnlySpaces() {
        Assertions.assertEquals(0, WordCounter.countWords("    "));
    }

    @Test
    void countWords_StringIsNull() {
        Assertions.assertEquals(0, WordCounter.countWords(null));
    }
}
