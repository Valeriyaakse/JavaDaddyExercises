package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task10_PersonSort;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonSortDemo {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("Vanya", 20), new Person("Vasya", 22),
                new Person("Maya", 19), new Person("Valya", 21), new Person("Anya", 19),
                new Person("Anya", 18), new Person("Galya", 20));
        List<Person> newList = list.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName)).collect(Collectors.toCollection(ArrayList::new));
    newList.stream().forEach(System.out::println);
    }
}
