//import com.sun.source.doctree.SeeTree;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//
//public class ThirdMaxNum {
////    Given an integer array nums, return the third distinct maximum number in this array.
////    If the third maximum does not exist, return the maximum number.
//public static void main(String[] args) {
//       int[] array = {2,2,3,1};
//  int ans =   max(array);
//    System.out.println(ans);
//}
//static int max(int[] array){
//    Set<Integer> set = new HashSet<>();
//    // apply any sorting algo to sort it first try to sort in descending order;
//    // use insertion sort
//    for (int i = 0; i < array.length; i++) {
//        for (int j = i; j > 0; j--) {
//            if (array[j] > array[j - 1]) {
//                swap(array, j, j - 1);
//            } else {
//                break;
//            }
//        }
//    }
//    // now the array is sorted in descending order
//    // make a hashSet to store unique values
//    for (int k = 0; k < array.length ; k++) {
//        if (!set.contains(array[k])){
//            set.add(array[k]);
//        }
//    }
//    if (set.size() >= 3) {
//        int[] uniqueArray = set.stream().mapToInt(Integer::intValue).toArray();
//        return uniqueArray[0];
//    }else {
//        return array[0];
//    }
//
//}
//    public static void swap(int[] array, int first, int second) {
//        int temp = array[first];
//        array[first] = array[second];
//        array[second] = temp;
//    }
//}
//                           but but in the previous solution the time complexity is O(n^2)
//                          here's the optimized solution
public class ThirdMaxNum {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 5, 3, 5};
        int ans = thirdMax(array);
        System.out.println(ans);
    }

    static int thirdMax(int[] nums) {
        Integer firstmax = null;
        Integer secondmax = null;
        Integer thirdmax = null;
        for (Integer num : nums) {
            if (num.equals(firstmax) || num.equals(secondmax) || num.equals(thirdmax)) {
                continue; // this condition is for duplicates elements
            }
            if (firstmax == null || num > firstmax) {
                thirdmax = secondmax;
                secondmax = firstmax;
                firstmax = num;
            } else if (secondmax == null || num > secondmax) {
                thirdmax = secondmax;
                secondmax = num;
            } else if (thirdmax == null || num > thirdmax) {
                thirdmax = num;
            }
        }
        if (thirdmax != null) {
            return thirdmax;
        } else {
            return firstmax; // If there are fewer than 3 distinct maximums, return the maximum
        }
    }
}

