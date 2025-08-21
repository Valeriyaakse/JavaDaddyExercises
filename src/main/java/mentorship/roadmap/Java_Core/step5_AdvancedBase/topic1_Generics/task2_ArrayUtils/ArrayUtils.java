package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task2_ArrayUtils;

public class ArrayUtils<T> {
    private  T array;

    public ArrayUtils(T array) {
        this.array = array;


    }
    public static  <T> void swap(T[] array, int i, int j) {
        T between = array[i];
        array[i] = array[j];
        array[j] = between;
        for(T arrays: array) {
            System.out.println(arrays);
        }
    }
}
