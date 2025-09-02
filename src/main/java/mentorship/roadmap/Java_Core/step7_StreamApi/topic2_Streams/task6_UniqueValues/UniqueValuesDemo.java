package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task6_UniqueValues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueValuesDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);
        List<Integer> uniclist = list.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(uniclist);
    }
}
