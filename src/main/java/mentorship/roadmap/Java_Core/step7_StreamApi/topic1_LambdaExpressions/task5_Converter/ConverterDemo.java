package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task5_Converter;

import java.util.Arrays;

public class ConverterDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(convertArray(arr, x -> x*x)));
    }


    static int[] convertArray(int[] array, Converter converter) {
        int[] newArray = new int[array.length];
        for(int i =0; i<array.length; i++) {
            newArray[i] = converter.convert(array[i]);
        }
        return newArray;
    }
}
