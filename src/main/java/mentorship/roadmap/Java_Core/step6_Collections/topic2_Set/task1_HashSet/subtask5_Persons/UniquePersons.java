package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask5_Persons;

import java.util.HashSet;

public class UniquePersons {
    public static void main(String[] args) {
        Person person1 = new Person("Dasha", 20);
        Person person2 = new Person("Masha", 25);
        Person person3 = new Person("Sasha", 30);
        Person person4 = new Person( "Sasha", 30);
        Person person5 = new Person("Dasha", 20);
        Person person6 = new Person( "Masha", 25);
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);
        hashSet.add(person4);
        hashSet.add(person5);
        hashSet.add(person6);
        System.out.println(hashSet);
    }
}
