package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask7_GroupByLength;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupByLength {
    public static void main(String[] args) {
        String[] arr = new String[]{"hi", "hello", "hey", "hola", "yo", "bonjour"};
        HashMap<Integer, List<String>> hashMap = new HashMap<>();

        for (String word : arr) {
            int wordLength = word.length();
            hashMap.computeIfAbsent(wordLength, k -> new ArrayList<>()).add(word);
// решение без computeIfAbsent()
//            if (!hashMap.containsKey(wordLength)) {
//                hashMap.put(wordLength, new ArrayList<>());
//            }
//
//            hashMap.get(wordLength).add(word);
        }

        for (Integer key : hashMap.keySet()) {
            System.out.println(key + " → " + hashMap.get(key));
        }
    }
}
