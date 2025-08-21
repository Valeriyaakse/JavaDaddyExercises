package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task2_ArrayUtils;

public class ArrayUtilsDemo {
    public static void main(String[] args) {
        String[] array = new String[] {"aaa", "bbb", "ccc", "ddd", "eee"};
        ArrayUtils.swap(array, 2,3);
        Integer[] arr = new Integer[] {1,2,3,4,5,6,7,8,9};
        ArrayUtils.swap(arr, 3,7);
    }
}