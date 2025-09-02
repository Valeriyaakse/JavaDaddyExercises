package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task1_FilterPerson;

import java.util.Arrays;
import java.util.List;

public class PersonFilterDemo {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("Vanya", 20),new Person("Vasya", 25),
                new Person("Maya", 31),new Person("Anya", 18),new Person("Sanya", 44));
        list.stream().filter(p -> p.getAge() > 30).forEach(System.out::println);
    }
}
