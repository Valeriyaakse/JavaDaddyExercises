package mentorship.roadmap.Java_Core.step6_Collections.topic4_Map.subtask4_GroupByFirstLetter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupByFirstLetter {
    public static void main(String[] args) {
        String[] names = new String[]{"Ваня", "Матвей","Вася","Маша","Таня", "Галя","Гоша", "Валя"};

        HashMap<Character, List<String>> hashMap = new HashMap<>();

        for (String name : names) {
            char firstLetter = name.charAt(0);

            if (!hashMap.containsKey(firstLetter)) {
                hashMap.put(firstLetter, new ArrayList<>());
            }

            hashMap.get(firstLetter).add(name);
        }

        for (char key : hashMap.keySet()) {
            System.out.println(key + " : " + hashMap.get(key));
        }
    }
}
