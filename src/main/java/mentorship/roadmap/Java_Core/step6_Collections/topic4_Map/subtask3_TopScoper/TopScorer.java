package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask3_TopScoper;

import java.util.HashMap;

public class TopScorer {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Vanya", 85);
        hashMap.put("Galya", 78);
        hashMap.put("Masha", 69);
        hashMap.put("Sasha", 92);
        hashMap.put("Dasha", 53);
       int max = 0;
       String nameMax = null;
        for (String name : hashMap.keySet()) {
            int value = hashMap.get(name);
            if (value > max) {
                max = value;
                nameMax = name;
            }
        }

        System.out.println(nameMax + " балл = " + max);
    }
}
