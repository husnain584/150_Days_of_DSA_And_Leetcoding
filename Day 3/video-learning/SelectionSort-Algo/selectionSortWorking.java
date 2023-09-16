import java.lang.reflect.Array;
import java.util.Arrays;

public class selectionSortWorking {
    public static void main(String[] args) {

        int[] array = {1,4,6,2,5};
        SelectionSort(array);
        System.out.println(Arrays.toString(array));

    }

    static  void SelectionSort(int[] array){
        for (int i = 0; i < array.length ; i++) {
            int last = array.length - i - 1;
            int max = max(array, 0 , last);

            // swap
             swap(array , max ,last);
        }
    }
    static  void  swap(int[] array , int first , int second){
        int tem = array[first];
         array[first] = array[second];
         array[second] = tem;
    }
    static int max(int[] array , int start , int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
            // find the largest number in the array
            if (array[max] < array[i]){
                max = i;
            }
        }
        return max;
    }
}
