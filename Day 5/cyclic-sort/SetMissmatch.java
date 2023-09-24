import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMissmatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(Mismatch(arr)));

    }
    static int[] Mismatch(int[] arrray){
        int[] ans = new int[2];
        int i = 0;
        while (i < arrray.length){
            if (arrray[i] != i + 1){
                int correctIndex = arrray[i] - 1;
                if (     arrray[i] != arrray[correctIndex]){
                    swap(arrray , i , correctIndex);
                }else {
                    i++;
                }
            }else {
                i++;
            };
        }
        for (int j = 0; j <arrray.length ; j++) {
            if (arrray[j] != j+1){
                ans[0] = arrray[j];
                ans[1] = j+1;
                break;
            }
        }
        return ans;
    }
    static void swap(int[] array ,int first ,int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
