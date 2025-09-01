package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask6_WordCounter;

import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String[] words = new String[] {"dog", "cat", "dog", "bird", "cat", "dog"};
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
        int count = hashMap.getOrDefault(word, 0);
        hashMap.put(word, count + 1);

        }
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }
    }
}
