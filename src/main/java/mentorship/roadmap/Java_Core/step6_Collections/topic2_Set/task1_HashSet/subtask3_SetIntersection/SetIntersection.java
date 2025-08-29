package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask3_SetIntersection;

import java.util.HashSet;

public class SetIntersection {
    public static void main(String[] args) {
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Даша");
        hashSet1.add("Маша");
        hashSet1.add("Женя");
        hashSet1.add("Саша");
        hashSet1.add("Таня");
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("Коля");
        hashSet2.add("Ваня");
        hashSet2.add("Женя");
        hashSet2.add("Саша");
        hashSet2.add("Гоша");
        HashSet<String> intersection = new HashSet<>(hashSet1);
        intersection.retainAll(hashSet2);
        System.out.println("Пересечение: " + intersection);

    }
}
