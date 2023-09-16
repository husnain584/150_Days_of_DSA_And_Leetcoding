
//takes a list of integers as input and sorts the list in ascending order using the bubble sort algorithm. You should return the sorted list as the output.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        int[] array = {22,34,5,6,4,3,23,22,23};
        Bubblesort(array);
        System.out.println(Arrays.toString(array));


    }
    static  void  Bubblesort(int[] array){
        boolean swapped;
        for (int i = 0; i <array.length ; i++) {
            swapped = false;
            for (int j = 1; j < array.length - i; j++) {
                // swap the element if j > j - 1;
                if (array[j] < array [j-1]){
                    //swap
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j-1] = temp;
                     swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

}
