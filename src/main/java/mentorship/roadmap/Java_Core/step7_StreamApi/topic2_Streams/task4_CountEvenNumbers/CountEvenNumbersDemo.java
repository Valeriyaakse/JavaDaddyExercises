package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task4_CountEvenNumbers;

import java.util.Arrays;
import java.util.List;

public class CountEvenNumbersDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 22,44);
        System.out.println(list.stream().filter(x -> x % 2 ==0).count());

    }
}
