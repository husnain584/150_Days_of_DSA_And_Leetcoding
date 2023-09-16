
// Questions: sort the array in accending order;

import java.util.Arrays;
public class BubbleSortAlgo {
    // we use bubble sort algo to sort the array;
    // what actually bubble sort algo do?
    // it makes comparisons with adjacent elements and sort the array;

    public static void main(String[] args) {
        int[] array = {3,6,1,89,3};
        Bubblesort(array);
        System.out.println(Arrays.toString(array));

    }
    static  void Bubblesort(int[] array){
        boolean swapped;
        //run the steps n times
        for (int i = 0; i < array.length ; i++) {
            swapped = false;
            // for each step the max element will come at the last respective index.
            for (int j = 1; j <= array.length-i-1 ; j++) {
                // swap if the item is smaller than the previous one
                if (array[j] < array[j - 1] ){
                    // swap
                    int temp = array[j];
                     array[j] = array[j-1];
                     array[j - 1 ] = temp;
                     swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
