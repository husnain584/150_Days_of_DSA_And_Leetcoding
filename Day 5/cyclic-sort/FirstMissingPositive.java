//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class FirstMissingPositive {
//    public static void main(String[] args) {
//       int[] array = {3,4,-1,1};
//       Cyclicsort(array);
//        System.out.println(Arrays.toString(array));
//    }
//
//    static int Cyclicsort(int[] array){
//        int i = 0;
//        while (i < array.length) {
//           if (array[i] != i + 1) {
//    int correctIndex = array[i] - 1;
//    if (correctIndex >= 0 && correctIndex < array.length && array[i] != array[correctIndex]) {
//        swap(array, i, correctIndex);
//    } else i++;
//}else i++;
//
//        }
//        for (int j = 0; j < array.length ; j++) {
//            if (array[j] != j+1){
//                return j+1;
//            }
//        }
//        return array.length + 1;
//    }
//    static void swap(int[] array ,int first ,int second){
//        int temp = array[first];
//        array[first] = array[second];
//        array[second] = temp;
//    }
//}

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] array = {3, 4, -1, 1};
        int missing = findFirstMissingPositive(array);
        System.out.println("First Missing Positive: " + missing);
    }

    static int findFirstMissingPositive(int[] array) {
        int n = array.length;

        // Step 1: Perform cyclic sort to arrange positive integers in their correct positions
        for (int i = 0; i < n; i++) {
            while (array[i] > 0 && array[i] <= n && array[i] != array[array[i] - 1]) {
                swap(array, i, array[i] - 1);
            }
        }

        // Step 2: Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (array[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positive integers are present, return the next positive integer
        return n + 1;
    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
