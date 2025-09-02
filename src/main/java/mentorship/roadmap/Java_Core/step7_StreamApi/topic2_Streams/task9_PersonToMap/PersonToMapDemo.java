package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task9_PersonToMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonToMapDemo {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("Vanya", 20), new Person("Vasya", 22),
                new Person("Maya", 19), new Person("Valya", 21), new Person("Tanya", 25),
                new Person("Anya", 18), new Person("Galya", 23));
        Map<Integer, String> map = list.stream().collect(Collectors.toMap(Person::getAge, Person::getName));
        for (Integer key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }


    }
}
