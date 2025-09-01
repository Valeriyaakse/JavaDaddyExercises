package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask5_HashMapIter;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 85);
        hashMap.put("Bob", 72);
        hashMap.put("Charlie", 90);
        hashMap.put("Diana", 68);
        hashMap.put("Dasha", 53);
        for (String name : hashMap.keySet()) {
            if (hashMap.get(name) > 75) {
                System.out.println(name);
            }
        }
    }
}
