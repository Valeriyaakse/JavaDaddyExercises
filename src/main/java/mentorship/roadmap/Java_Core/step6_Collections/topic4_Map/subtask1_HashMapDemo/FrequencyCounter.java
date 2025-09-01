package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask1_HashMapDemo;

import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        String[] array = new String[] {"Apple", "Banana", "Apple", "Orange", "Banana", "Apple"};
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String values : array) {
            if (hashMap.containsKey(values)) {
                hashMap.put(values, hashMap.get(values) + 1);
            } else {
                hashMap.put(values, 1);
            }

        }
        System.out.println(hashMap);

    }
}
