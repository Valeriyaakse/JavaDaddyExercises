package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task2_MaxFinder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxFinderTest {

    @Test
    void findMax_singleElementArray() {
        int[] arr = {42};
        int max = MaxFinder.findMax(arr);
        Assertions.assertEquals(42, max);
    }

    @Test
    void findMax_negativeNumbers() {
        int[] arr = {-5, -10, -3, -42};
        int max = MaxFinder.findMax(arr);
        Assertions.assertEquals(-3, max);
    }

    @Test
    void findMax_withDuplicates() {
        int[] arr = {1, 7, 7, 3, 1};
        int max = MaxFinder.findMax(arr);
        Assertions.assertEquals(7, max);
    }

    @Test
    void findMax_emptyArray_shouldThrow() {
        int[] arr = {};
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> MaxFinder.findMax(arr));
    }
}
