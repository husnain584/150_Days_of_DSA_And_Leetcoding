import java.util.Arrays;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[ ] array = {1,3,4,2,2};
        missingElement(array);
        System.out.println(Arrays.toString(array));
    }

    public static int missingElement(int[] array) {
        int i = 0;
        while (i < array.length) {

            if (array[i] != i + 1) {

                int correctIndex = array[i] - 1;
                if (array[i] != array[correctIndex]) {
                    swap(array, i, correctIndex);
                }else {
                    return array[i];
                }
            }else i++;
        }
return -1;
    }
    static  void swap(int[] array ,int first , int second){
        int tem = array[first];
         array[first] = array[second];
         array[second] = tem;
    }
}
