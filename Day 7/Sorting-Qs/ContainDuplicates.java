import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {
//    public static void main(String[] args) {
//       int[] array = {1,2,3,5,6,7,8,9};
//        System.out.println(duplicates(array));
//    }
//    public static boolean duplicates(int[] nums) {
//
//        // Sort the array using insertion sort
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j > 0; j--) {
//                if (nums[j] < nums[j - 1]) {
//                    swap(nums, j, j - 1);
//                } else {
//                    break;
//                }
//            }
//        }
//
//        // Check for adjacent duplicates
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == nums[i + 1]) {
//                return true; // Duplicate found
//            }
//        }
//
//        return false; // No duplicates found
//    }
//
//    public static void swap(int[] array, int first, int second) {
//        int temp = array[first];
//        array[first] = array[second];
//        array[second] = temp;
//    }
                                        // but i this soloution time limits exceeds we want a algo which is
                                        // efficient for duplicats
         // here's we use hashset dataset
       // hash set data set allows fast insertion and lookup with no duplicates elements;
public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4,};
    System.out.println(duplicates(nums));

}
public static  boolean duplicates(int[] nums){
    // create a hashset to store unique elemnts
    Set<Integer> set = new HashSet<>();

    // iterate array through for each loop
    for (int i = 0; i < nums.length  ; i++) {
        if (set.contains(nums[i]) ){
            return true;
        }else {
            set.add(nums[i]);
        }
    }
return false;
}

}
