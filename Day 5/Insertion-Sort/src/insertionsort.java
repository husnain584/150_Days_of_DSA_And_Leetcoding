import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] array = {5,3,4,1,2};
        Insertionsort(array);
        System.out.println(Arrays.toString(array));
    }
   public static void Insertionsort(int[] array){

       for (int i = 0; i < array.length - 1 ; i++) {
           int j = i + 1;
           while (j > 0 && array[j] < array[j - 1]) {
               swap(array, j, j - 1);
               j--;
           }
       }
    }
   public static void  swap ( int [] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second ] = temp;
    }
}
