import java.util.Arrays;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] array = {4,2,5,7};
        parity(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] parity(int[] array){
        int[] result = new int[array.length];
        int i = 0 ;
        int j = 1;
        for (int arr: array) {
            if ( arr % 2 == 0){
                result[i] = arr;
                i+=2;
        }else {
                result[j] = arr;
                j+=2;
            }

        }
        return array;
    }

}
