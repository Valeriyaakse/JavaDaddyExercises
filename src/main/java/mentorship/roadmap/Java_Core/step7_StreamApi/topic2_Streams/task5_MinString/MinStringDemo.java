package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task5_MinString;

import java.util.Arrays;
import java.util.List;

public class MinStringDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("elephant", "cat", "hippopotamus", "dog", "lion");
        System.out.println(list.stream().min((str1,str2) -> str1.length()-str2.length()));
    }
}
