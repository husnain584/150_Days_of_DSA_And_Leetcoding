import java.lang.reflect.Array;
import java.util.Arrays;

public class FindAllMissingNumbers {
    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1};
        Cyclicsort(array);
        System.out.println(Arrays.toString(array));
    }
    static void  Cyclicsort(int[] array){
        int i = 0;
        while (i < array.length){
            int correctIndex = array[i] - 1;
            if (array[i] != array[correctIndex]){
                swap(array , i , correctIndex);
            }
            else i++;
        }

    }
    static void swap(int[] array ,int first ,int second){
            int temp = array[first];
            array[first] = array[second];
            array[second] = temp;
    }
}
