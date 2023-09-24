import java.util.Arrays;

public class SortArrayByParity {
//    Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//    Return any array that satisfies this condition.
public static void main(String[] args) {
    int[] array = {3,1,2,4};
    sortArray(array);
    System.out.println(Arrays.toString(array));
}
public static  void sortArray(int[] array){
    int i = 0;
    int j = 0;
    while ( i < array.length){
        if (array[i] % 2 != 0){
            i++;
        }else {
            swap(array , i , j);
            i++;
            j++;
        }
    }

}
    static void swap(int[] array , int first , int second){
        int tem = array[first];
        array[first]  =array[second];
        array[second] = tem;
    }

}
