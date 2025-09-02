package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task3_GroupWords;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupWordsDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "ant", "banana", "berry", "cherry", "carrot");

        Map<Character, List<String>> sortedMap = new TreeMap<>(list.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0))));
        for (Character key : sortedMap.keySet()) {
            System.out.println(key + " : " + sortedMap.get(key));
        }

    }
}
