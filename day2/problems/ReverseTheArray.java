import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] array = {1,2,3};

      array = reverse(array);
        System.out.println(Arrays.toString(array));

    }

   public static int[] reverse(int[] array){

        int start = 0;
        int end = array.length-1;

        while ( start < end){
            int temp = array[start];
             array[start] = array[end];
             array[end] = temp;
             start++;
             end--;
        }
        return array;
        }
}

