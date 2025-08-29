package mentorship.roadmap.Java_Core.step6_Collections.topic2_Set.task1_HashSet.subtask5_Persons;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    Person(String name, int age) {
       this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        } if (obj == null || getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return age == other.age && Objects.equals(name, other.name);


    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
