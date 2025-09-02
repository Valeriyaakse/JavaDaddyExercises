package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task3_ArraySort;

import java.util.Arrays;


public class LambdaArraySortDemo {
    public static void main(String[] args) {
        String[] arr = new String[] {"Java", "Lambda", "Stream", "API"};
        Arrays.sort(arr, (a,b) -> a.length() - b.length());
        System.out.println(Arrays.toString(arr));
    }
}
