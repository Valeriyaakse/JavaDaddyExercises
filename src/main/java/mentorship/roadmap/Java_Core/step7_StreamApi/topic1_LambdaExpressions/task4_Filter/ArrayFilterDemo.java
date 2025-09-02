package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task4_Filter;

import java.util.ArrayList;
import java.util.List;



public class ArrayFilterDemo {
    public static <T> List<T> filterArray(T[] array, MyPredicate<T> predicate) {
       List<T> list = new ArrayList<T>();
        for (T value : array ) {
            if (predicate.test(value)) {
                list.add(value);
            }
        }
        return list;

    }
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 12, 7, 20, 3};
        System.out.println(filterArray(arr, x -> x > 10));
    }
}
