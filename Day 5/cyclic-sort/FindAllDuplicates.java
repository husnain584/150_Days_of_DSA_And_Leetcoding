import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] array = {4,3,2,7,8,2,3,1};
        System.out.println(Duplicates(array));

    }
    static List<Integer> Duplicates(int[] arrray){
        List<Integer> ans = new ArrayList<>();

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
                ans.add(arrray[j]);
            }
        }
        return ans;
    }
    static void swap(int[] array , int first , int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
