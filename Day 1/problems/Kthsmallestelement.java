

//Given an array arr[] and an integer K where K is smaller than size of array,
// the task is to find the Kth smallest element in the given array. It is given
// that all array elements are distinct.

// example

//Input:
//        N = 6
//        arr[] = 7 10 4 3 20 15
//        K = 3
//        Output : 7

import java.util.Arrays;

public class Kthsmallestelement {
    public static void main(String[] args) {

        int[] array = { 3,5,21,3,45,67,2};
        int k = 3;

        Arrays.sort(array);
       int Min = array[k - 1];
       int Max = array[array.length - k];

    }
}
